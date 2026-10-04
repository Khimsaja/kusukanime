package f6;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: f6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913k {
    public boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f11569b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f11570c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11571d;

    public final C0914l a() {
        return new C0914l(this.a, this.f11571d, this.f11569b, this.f11570c);
    }

    public final void b(C0912j... c0912jArr) {
        kotlin.jvm.internal.l.f("cipherSuites", c0912jArr);
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c0912jArr.length);
        for (C0912j c0912j : c0912jArr) {
            arrayList.add(c0912j.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        kotlin.jvm.internal.l.f("cipherSuites", strArr);
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f11569b = (String[]) strArr.clone();
    }

    public final void d(EnumC0899M... enumC0899MArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC0899MArr.length);
        for (EnumC0899M enumC0899M : enumC0899MArr) {
            arrayList.add(enumC0899M.f11521k);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void e(String... strArr) {
        kotlin.jvm.internal.l.f("tlsVersions", strArr);
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f11570c = (String[]) strArr.clone();
    }
}
