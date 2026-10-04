package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f1871l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int f1872k;

    public i(int i7) {
        this.f1872k = i7;
    }

    public i(Exception exc, int i7) {
        super(exc);
        this.f1872k = i7;
    }

    public i(String str, int i7) {
        super(str);
        this.f1872k = i7;
    }

    public i(String str, Exception exc, int i7) {
        super(str, exc);
        this.f1872k = i7;
    }
}
