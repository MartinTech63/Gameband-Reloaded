package com.nowcomputing.uistuff;

import com.nowcomputing.LocaleUtil;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class D extends at {
   private G a;

   protected D(G var1) {
      super("IMPORT");
      this.a = var1;
      this.a();
   }

   protected void a() {
      JPanel var1 = new JPanel();
      var1.setOpaque(false);
      this.add(var1);
      var1.setLayout(new BoxLayout(var1, 1));
      var1.setBorder(new EmptyBorder(100, 0, 0, 0));
      C var2 = new C(LocaleUtil.getLocalizedString("IMPORT_DATA_HEADING"), 420, "center");
      am.a(var1, var2, GamebandFonts.i, GamebandColors.a());
      var2.setAlignmentX(0.5F);
      var1.add(Box.createVerticalStrut(20));
      C var3 = new C(LocaleUtil.getLocalizedString("IMPORT_DATA_DESC_1"), 420, "center");
      am.a(var1, var3, GamebandFonts.k, Color.WHITE);
      var3.setAlignmentX(0.5F);
      var1.add(Box.createVerticalStrut(20));
      C var4 = new C(LocaleUtil.getLocalizedString("IMPORT_DATA_DESC_2"), 420, "center");
      am.a(var1, var4, GamebandFonts.k, Color.WHITE);
      var4.setAlignmentX(0.5F);
      var1.add(Box.createVerticalStrut(20));
      C var5 = new C(LocaleUtil.getLocalizedString("IMPORT_DATA_WITH_MODS"), 420, "center");
      am.a(var1, var5, GamebandFonts.k, Color.WHITE);
      var5.setAlignmentX(0.5F);
      var1.add(Box.createVerticalStrut(50));
      this.a(var1);
   }

   private void a(JPanel var1) {
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 1));
      var2.setOpaque(false);
      var2.setAlignmentX(0.5F);
      var2.setMaximumSize(new Dimension(436, 32));
      var1.add(var2);
      JPanel var3 = new JPanel();
      var3.setLayout(new GridLayout(1, 2, 20, 2));
      var3.setOpaque(false);
      var3.setMaximumSize(new Dimension(180, 32));
      var2.add(var3);
      JButton var4 = new JButton(LocaleUtil.getLocalizedString("YES"));
      var4.setFont(GamebandFonts.n);
      var4.setBackground(GamebandColors.e());
      var4.setForeground(GamebandColors.f());
      var4.addActionListener(new E(this));
      var3.add(var4);
      JButton var5 = new JButton(LocaleUtil.getLocalizedString("NO"));
      var5.setFont(GamebandFonts.n);
      var5.setBackground(GamebandColors.e());
      var5.setForeground(GamebandColors.f());
      var5.addActionListener(new F(this));
      var3.add(var5);
   }

   // $FF: synthetic method
   static G a(D var0) {
      return var0.a;
   }
}
