package com.nowcomputing.b.a;

import com.nowcomputing.LocaleUtil;
import com.nowcomputing.uistuff.GamebandColors;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class l extends JToolBar {
   private CustomDialog a;

   public l(CustomDialog var1) {
      this.a = var1;
      this.setBackground(GamebandColors.e);
      this.setBorder(BorderFactory.createLineBorder(LocaleUtil.h.e, 1));
      this.setOrientation(0);
      this.setFloatable(false);
      this.setRollover(false);
      this.setOpaque(true);
      this.a(var1.v().g());
      this.a(var1.v().h());
      this.addSeparator();
      this.a(var1.v().i());
      this.a(var1.v().j());
      this.addSeparator();
      this.a(var1.v().c());
      this.a(var1.v().a());
      this.a(var1.v().b());
   }

   private void a(Action var1) {
      JButton var2 = new JButton(var1);
      var2.setText("");
      var2.setSize(40, 30);
      var2.setFocusable(false);
      this.add(var2);
   }
}
