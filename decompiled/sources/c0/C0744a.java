package c0;

import B1.RunnableC0016c;
import F0.h;
import F0.n;
import F0.q;
import H0.C0214f;
import I1.j;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import e4.k;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.l;
import z0.M0;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744a {
    public static final C0744a a = new C0744a();

    public static void a(ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        M0 m02;
        n nVar;
        k kVar;
        int i7 = 0;
        while (i7 < longSparseArray.size()) {
            int i8 = i7 + 1;
            long jKeyAt = longSparseArray.keyAt(i7);
            ViewTranslationResponse viewTranslationResponseM = j.m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM != null && (value = viewTranslationResponseM.getValue("android:text")) != null && (text = value.getText()) != null && (m02 = (M0) viewOnAttachStateChangeListenerC0746c.c().e((int) jKeyAt)) != null && (nVar = m02.a) != null) {
                Object obj = nVar.f2104d.f2096k.get(h.f2079j);
                if (obj == null) {
                    obj = null;
                }
                F0.a aVar = (F0.a) obj;
                if (aVar != null && (kVar = (k) aVar.f2062b) != null) {
                }
            }
            i7 = i8;
        }
    }

    public final void b(ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        n nVar;
        String strN;
        for (long j7 : jArr) {
            M0 m02 = (M0) viewOnAttachStateChangeListenerC0746c.c().e((int) j7);
            if (m02 != null && (nVar = m02.a) != null) {
                j.p();
                ViewTranslationRequest.Builder builderK = j.k(viewOnAttachStateChangeListenerC0746c.f11121k.getAutofillId(), nVar.f2107g);
                Object obj = nVar.f2104d.f2096k.get(q.f2148u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (strN = android.support.v4.media.session.b.n(list, "\n", null, 62)) != null) {
                    builderK.setValue("android:text", TranslationRequestValue.forText(new C0214f(strN, null, 6)));
                    consumer.accept(builderK.build());
                }
            }
        }
    }

    public final void c(ViewOnAttachStateChangeListenerC0746c viewOnAttachStateChangeListenerC0746c, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(viewOnAttachStateChangeListenerC0746c, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0746c.f11121k.post(new RunnableC0016c(21, viewOnAttachStateChangeListenerC0746c, longSparseArray));
        }
    }
}
