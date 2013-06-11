ABOUT
=====

SystemWidePanel is a Service which shows a drag&drop-enabled panel system-wide. 
It can be put everywhere on the screen except on top of the navigation bar. 
Usually, the panel is on top of everything else. Using appropriate panel 
layouts for both orientations with exactly the same dimensions (just other 
orientations), the panel keeps its position after an orientation change (if 
possible).

USAGE
=====

1.  Edit panel.xml in res/layout-land and res/layout-port to include your own
    panel. Make sure that the height/width of the landscape panel matches the 
    width/height of the portrait panel, respectively. Else, at least orientation
    changes lead to a wrong position of the panel.
2.  Edit registerPanelListeners() in PanelService.java according to your layout.
3.  Start the service. You can pass the initial position of the panel.

LICENSE
=======

See COPYING. For different licensing, contact me at <apps@cygery.com>.


If you find this software useful or if you use it in one of own your 
applications, feel free to contact me at <apps@cygery.com>.
