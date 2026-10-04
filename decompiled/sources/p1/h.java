package p1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0679f;
import androidx.lifecycle.InterfaceC0694v;

/* loaded from: classes.dex */
public final class h implements InterfaceC0679f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0690q f14178k;

    public h(EmojiCompatInitializer emojiCompatInitializer, AbstractC0690q abstractC0690q) {
        this.f14178k = abstractC0690q;
    }

    @Override // androidx.lifecycle.InterfaceC0679f
    public final void onResume(InterfaceC0694v interfaceC0694v) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC1778a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j(), 500L);
        this.f14178k.c(this);
    }
}
