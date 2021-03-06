package com.andela.checksmarter.activities

import android.app.Application
import android.content.Context
import com.andela.checksmarter.utilities.alarm.ReminderManager
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by CodeKenn on 19/04/16.
 */
class CheckSmarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val realmConfiguration = RealmConfiguration.Builder(this)
                .deleteRealmIfMigrationNeeded()
                .build()

        Realm.setDefaultConfiguration(realmConfiguration)
    }
}