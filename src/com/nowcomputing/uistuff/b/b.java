package com.nowcomputing.uistuff.b;

import com.nowcomputing.Image;
import com.nowcomputing.TimeDisplay;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.AnimatedImage;
import com.nowcomputing.uistuff.GamebandFonts;
import com.nowcomputing.uistuff.apackage.t;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class b extends e implements ActionListener {
   Image.b a;
   private AnimatedImage.g g;

   public b(t var1, Image.b var2) {
      super(var1, LocaleUtil.getLocalizedString("DATE"));
      this.a = var2;
      this.h();
      this.g = new AnimatedImage.g();
      var2.a(this.g);
      JRadioButton var3 = new JRadioButton(TimeDisplay.normal.a());
      var3.setActionCommand(TimeDisplay.normal.a());
      var3.setOpaque(false);
      var3.setFont(GamebandFonts.u);
      var3.setForeground(LocaleUtil.h.m);
      var3.setBounds(278, 6, 120, 20);
      this.add(var3);
      JRadioButton var4 = new JRadioButton(TimeDisplay.crackhead.a());
      var4.setActionCommand(TimeDisplay.crackhead.a());
      var4.setOpaque(false);
      var4.setFont(GamebandFonts.u);
      var4.setForeground(LocaleUtil.h.m);
      var4.setBounds(278, 24, 120, 20);
      this.add(var4);
      if (var2.e() == 2) {
         var4.setSelected(true);
      } else {
         var3.setSelected(true);
      }

      ButtonGroup var5 = new ButtonGroup();
      var5.add(var3);
      var5.add(var4);
      var3.addActionListener(this);
      var4.addActionListener(this);
   }

   public Image.g b() {
      return this.a;
   }

   public void d() {
      SimpleDateFormat var1 = new SimpleDateFormat(this.a.b().b(), LocaleUtil.a());
      var1.setTimeZone(LocaleUtil.e());
      String var2 = var1.format(new Date());
      this.a(this.e.d().c());
      Image var3 = this.a(var2);
      this.a.h().b(var3);
      this.a.i().a(var3);
      this.a.i().b(new Image(20, 7));
      this.g.a(var3, AnimatedImage.h.a, 3000, 20);
      super.d();
   }

   public void actionPerformed(ActionEvent var1) {
      if (TimeDisplay.normal.a().equals(var1.getActionCommand())) {
         this.a.a(TimeDisplay.normal);
      } else if (TimeDisplay.crackhead.a().equals(var1.getActionCommand())) {
         this.a.a(TimeDisplay.crackhead);
      }

      this.e.a(true);
      if (this.j()) {
         this.e();
         this.d();
      }

   }

   private Image a(String var1) {
      int var2 = this.e.d().a() == 0 ? 3 : 0;
      Image var3 = new Image(20, 7);
      var3.ramImageInForcefully((Image) Image.FromFile(var1), var2, 1);
      return var3;
   }
}
