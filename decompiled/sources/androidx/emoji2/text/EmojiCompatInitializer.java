package androidx.emoji2.text;

import M0.C0468a;
import N2.a;
import N2.b;
import android.content.Context;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p1.g;
import p1.h;
import p1.o;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // N2.b
    public final Object create(Context context) {
        Object objB;
        o oVar = new o(new C0468a(context, 2));
        oVar.a = 1;
        if (g.f14169k == null) {
            synchronized (g.f14168j) {
                try {
                    if (g.f14169k == null) {
                        g.f14169k = new g(oVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f6926e) {
            try {
                objB = aVarC.a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0690q abstractC0690qF = ((InterfaceC0694v) objB).f();
        abstractC0690qF.a(new h(this, abstractC0690qF));
        return Boolean.TRUE;
    }

    @Override // N2.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
