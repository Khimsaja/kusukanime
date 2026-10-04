package H1;

import B1.AbstractC0015b;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import y1.C2393o;

/* renamed from: H1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234o extends y1.F {

    /* renamed from: m, reason: collision with root package name */
    public final int f3548m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3549n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3550o;

    /* renamed from: p, reason: collision with root package name */
    public final C2393o f3551p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3552q;

    /* renamed from: r, reason: collision with root package name */
    public final O1.B f3553r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3554s;

    public C0234o(int i7, Exception exc, int i8) {
        this(i7, exc, i8, null, -1, null, 4, false);
    }

    public final C0234o a(O1.B b4) {
        String message = getMessage();
        int i7 = B1.K.a;
        return new C0234o(message, getCause(), this.f17934k, this.f3548m, this.f3549n, this.f3550o, this.f3551p, this.f3552q, b4, this.f17935l, this.f3554s);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234o(String str, Throwable th, int i7, int i8, String str2, int i9, C2393o c2393o, int i10, O1.B b4, long j7, boolean z7) {
        super(str, th, i7, j7);
        Bundle bundle = Bundle.EMPTY;
        AbstractC0015b.c(!z7 || i8 == 1);
        AbstractC0015b.c(th != null || i8 == 3);
        this.f3548m = i8;
        this.f3549n = str2;
        this.f3550o = i9;
        this.f3551p = c2393o;
        this.f3552q = i10;
        this.f3553r = b4;
        this.f3554s = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0234o(int i7, Exception exc, int i8, String str, int i9, C2393o c2393o, int i10, boolean z7) {
        String str2;
        int i11;
        C2393o c2393o2;
        String string;
        String str3;
        if (i7 == 0) {
            str2 = str;
            i11 = i9;
            c2393o2 = c2393o;
            string = "Source error";
        } else if (i7 != 1) {
            if (i7 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i11 = i9;
            c2393o2 = c2393o;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i11 = i9;
            sb.append(i11);
            sb.append(", format=");
            c2393o2 = c2393o;
            sb.append(c2393o2);
            sb.append(", format_supported=");
            int i12 = B1.K.a;
            if (i10 == 0) {
                str3 = "NO";
            } else if (i10 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i10 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : A6.b.h(string, ": null"), exc, i8, i7, str2, i11, c2393o2, i10, null, SystemClock.elapsedRealtime(), z7);
    }
}
