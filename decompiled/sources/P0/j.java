package P0;

import H0.n;
import H0.p;
import android.text.TextPaint;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.InterfaceC0995r;
import j0.AbstractC1299e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {
    public static final k a = new k(false);

    public static final void a(n nVar, InterfaceC0995r interfaceC0995r, AbstractC0993p abstractC0993p, float f5, C0972Q c0972q, S0.j jVar, AbstractC1299e abstractC1299e) {
        ArrayList arrayList = nVar.f3134h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            p pVar = (p) arrayList.get(i7);
            pVar.a.g(interfaceC0995r, abstractC0993p, f5, c0972q, jVar, abstractC1299e);
            interfaceC0995r.f(0.0f, pVar.a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f5) {
        if (Float.isNaN(f5)) {
            return;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f5 * 255));
    }
}
