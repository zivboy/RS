package com.ssm.business.service.thread;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.ssm.business.entity.Item;
import com.ssm.business.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vincent on 2015/11/5.
 */
//导入数据字段
public class ImportThread implements Runnable {

    public ImportThread(){}

    ItemService itemService;

    private int modelId;
    private String fileName;
    private List<String> fieldHtml, columnHtml;

    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    public ImportThread(int modelId, String fileName, List<String> fieldHtml, List<String> columnHtml) {
        this.modelId = modelId;
        this.fileName = fileName;
        this.fieldHtml = fieldHtml;
        this.columnHtml = columnHtml;
    }

    @Override
    public synchronized void run() {
        List<Item> list = new ArrayList<Item>();
        int i = 0;
        for (String field : fieldHtml) {
            if(!StringUtils.isBlank(field.trim())) {
                String[] columnArray = columnHtml.get(i).split("\\.");
                Item item = new Item();
                item.setModelId(modelId);
                item.setState(1);
                item.setSourceTabel(fileName);
                item.setSourceField(field);
                item.setTargetTable(columnArray[0]);
                item.setTargetField(columnArray[1]);
                i++;
                list.add(item);
            }
        }
        if (list != null) {
            itemService.saveBatch(list);
        }
    }
}
