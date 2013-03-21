/*
 * Copyright 2013 Erwin Goslawski
 *
 * This file is part of SystemWidePanel.
 *
 * SystemWidePanel is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SystemWidePanel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SystemWidePanel.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.cygery.systemwidepanel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_start).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // pass start coordinates of panel
                startService(new Intent(MainActivity.this, PanelService.class).putExtra(
                        getPackageName() + ".x", 300).putExtra(getPackageName() + ".y", 400));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(new Intent(this, PanelService.class));
    }
}
