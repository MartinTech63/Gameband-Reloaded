package com.nowcomputing.b.a;

import com.nowcomputing.LockingUtil;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class f implements ChangeListener {
   // $FF: synthetic field
   final CustomDialog a;

   f(CustomDialog var1) {
      this.a = var1;
   }

   public void stateChanged(ChangeEvent var1) {
      JSpinner var2 = (JSpinner)var1.getSource();
      LockingUtil.logger.a.a(this.a).c((Integer)var2.getValue());
   }
}
