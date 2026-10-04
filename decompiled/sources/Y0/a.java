package Y0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10047b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f10048c;
    public final CancellationException a;

    static {
        if (g.f10057d) {
            f10048c = null;
            f10047b = null;
        } else {
            f10048c = new a(false, null);
            f10047b = new a(true, null);
        }
    }

    public a(boolean z7, CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
