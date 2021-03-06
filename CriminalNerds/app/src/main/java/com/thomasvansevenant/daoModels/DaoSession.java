package com.thomasvansevenant.daoModels;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.thomasvansevenant.daoModels.Crime;

import com.thomasvansevenant.daoModels.CrimeDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig crimeDaoConfig;

    private final CrimeDao crimeDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        crimeDaoConfig = daoConfigMap.get(CrimeDao.class).clone();
        crimeDaoConfig.initIdentityScope(type);

        crimeDao = new CrimeDao(crimeDaoConfig, this);

        registerDao(Crime.class, crimeDao);
    }
    
    public void clear() {
        crimeDaoConfig.getIdentityScope().clear();
    }

    public CrimeDao getCrimeDao() {
        return crimeDao;
    }

}
