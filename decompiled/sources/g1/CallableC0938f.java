package g1;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0938f implements Callable {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11681c;

    public CallableC0938f(String str, Context context, List list) {
        this.a = str;
        this.f11680b = context;
        this.f11681c = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return AbstractC0940h.b(this.a, this.f11680b, this.f11681c);
        } catch (Throwable unused) {
            return new C0939g(-3);
        }
    }
}
