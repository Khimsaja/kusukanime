package j;

import f.AbstractC0841b;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class a extends AbstractC0841b {

    /* renamed from: l, reason: collision with root package name */
    public static volatile a f12199l;

    /* renamed from: k, reason: collision with root package name */
    public final Object f12200k;

    public a(int i7) {
        switch (i7) {
            case 1:
                this.f12200k = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f12200k = new a(1);
                break;
        }
    }
}
