package com.nowcomputing;

import java.util.concurrent.Callable;

class y implements Callable {
   // $FF: synthetic field
   final x a;

   y(x var1) {
      this.a = var1;
   }

   public Void a() {
      if (MinecraftDownloader.a(this.a.a)) {
         return null;
      } else {
         MinecraftDownloader.a(this.a.a, 0L);
         MinecraftDownloader.b(this.a.a, 0L);
         this.a.a.d();
         return null;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
