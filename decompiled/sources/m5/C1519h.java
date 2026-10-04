package m5;

import e4.InterfaceC0821a;

/* renamed from: m5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1519h implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final C1523l f12980k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0821a f12981l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Object f12982m;

    public C1519h(C1523l c1523l, InterfaceC0821a interfaceC0821a) {
        if (c1523l == null) {
            a(0);
            throw null;
        }
        this.f12982m = EnumC1522k.f12986k;
        this.f12980k = c1523l;
        this.f12981l = interfaceC0821a;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 2 || i7 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 == 2 || i7 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i7 != 2 && i7 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public E3.b c(boolean z7) {
        E3.b bVarD = this.f12980k.d("in a lazy value", null);
        if (bVarD != null) {
            return bVarD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    @Override // e4.InterfaceC0821a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12982m
            boolean r1 = r0 instanceof m5.EnumC1522k
            if (r1 != 0) goto La
            w5.k.j(r0)
            return r0
        La:
            m5.l r0 = r5.f12980k
            m5.n r0 = r0.a
            r0.l()
            java.lang.Object r0 = r5.f12982m     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof m5.EnumC1522k     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            w5.k.j(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            m5.l r1 = r5.f12980k
            m5.n r1 = r1.a
            r1.k()
            return r0
        L22:
            r0 = move-exception
            goto L75
        L24:
            m5.k r1 = m5.EnumC1522k.f12987l
            m5.k r2 = m5.EnumC1522k.f12988m
            if (r0 != r1) goto L38
            r5.f12982m = r2     // Catch: java.lang.Throwable -> L22
            r3 = 1
            E3.b r3 = r5.c(r3)     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.f1931b     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L38
            java.lang.Object r0 = r3.f1932c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            if (r0 != r2) goto L46
            r0 = 0
            E3.b r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.f1931b     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L46
            java.lang.Object r0 = r0.f1932c     // Catch: java.lang.Throwable -> L22
            goto L1a
        L46:
            r5.f12982m = r1     // Catch: java.lang.Throwable -> L22
            e4.a r0 = r5.f12981l     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L54
            r5.b(r0)     // Catch: java.lang.Throwable -> L54
            r5.f12982m = r0     // Catch: java.lang.Throwable -> L54
            goto L1a
        L54:
            r0 = move-exception
            boolean r2 = w5.k.h(r0)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L6e
            java.lang.Object r2 = r5.f12982m     // Catch: java.lang.Throwable -> L22
            if (r2 != r1) goto L66
            w5.j r1 = new w5.j     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r5.f12982m = r1     // Catch: java.lang.Throwable -> L22
        L66:
            m5.l r1 = r5.f12980k     // Catch: java.lang.Throwable -> L22
            m5.a r1 = r1.f12992b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L6e:
            m5.k r1 = m5.EnumC1522k.f12986k     // Catch: java.lang.Throwable -> L22
            r5.f12982m = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L75:
            m5.l r1 = r5.f12980k
            m5.n r1 = r1.a
            r1.k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.C1519h.invoke():java.lang.Object");
    }

    public void b(Object obj) {
    }
}
