package com.lib.Service.Cost;
/*
    Author:Yin
*/
import com.lib.Dao.CostDao;
import com.lib.Entity.Cost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCostService {
    private final CostDao costDao;

    @Autowired(required = false)
    public MyCostService(CostDao costDao){
        this.costDao=costDao;
    }

    public List<Cost> findMyCost(String ReaderNo){
        return costDao.getBorrowHistory(ReaderNo);
    }

    public int getHistory(String ReaderNo){
        return costDao.getHistoryCount(ReaderNo);
    }

    public int getCostCount(String ReaderNo){
        return costDao.getCostCount(ReaderNo);
    }
}
