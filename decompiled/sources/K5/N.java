package K5;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public abstract class N {
    public static final F2.G a = new F2.G("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final F2.G f4771b = new F2.G("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final F2.G f4772c = new F2.G("PENDING", 1);

    public static M a(int i7, J5.c cVar) {
        int i8 = (i7 & 1) != 0 ? 0 : 1;
        int i9 = (i7 & 2) == 0 ? 16 : 0;
        if ((i7 & 4) != 0) {
            cVar = J5.c.f4299k;
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i8, "replay cannot be negative, but was ").toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i9, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i8 <= 0 && i9 <= 0 && cVar != J5.c.f4299k) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + cVar).toString());
        }
        int i10 = i9 + i8;
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        return new M(i8, i10, cVar);
    }

    public static final Y b(Object obj) {
        if (obj == null) {
            obj = L5.c.f6161b;
        }
        return new Y(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(K5.a0 r4, e4.o r5, java.lang.Throwable r6, U3.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof K5.C0334m
            if (r0 == 0) goto L13
            r0 = r7
            K5.m r0 = (K5.C0334m) r0
            int r1 = r0.f4831m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4831m = r1
            goto L18
        L13:
            K5.m r0 = new K5.m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4830l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4831m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f4829k
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r7)
            r0.f4829k = r6     // Catch: java.lang.Throwable -> L29
            r0.f4831m = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            O3.C r4 = O3.C.a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            q0.c.j(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.c(K5.a0, e4.o, java.lang.Throwable, U3.c):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(K5.C0332k r5, K5.InterfaceC0330i r6, U3.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof K5.r
            if (r0 == 0) goto L13
            r0 = r7
            K5.r r0 = (K5.r) r0
            int r1 = r0.f4849m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4849m = r1
            goto L18
        L13:
            K5.r r0 = new K5.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4848l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4849m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.x r5 = r0.f4847k
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r7)
            kotlin.jvm.internal.x r7 = new kotlin.jvm.internal.x
            r7.<init>()
            H.F r2 = new H.F     // Catch: java.lang.Throwable -> L4e
            r4 = 4
            r2.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L4e
            r0.f4847k = r7     // Catch: java.lang.Throwable -> L4e
            r0.f4849m = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r6 = move-exception
            r5 = r7
        L50:
            java.lang.Object r5 = r5.f12720k
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5c
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7e
        L5c:
            S3.h r7 = r0.getContext()
            H5.e0 r0 = H5.C0263e0.f3843k
            S3.f r7 = r7.get(r0)
            H5.f0 r7 = (H5.InterfaceC0265f0) r7
            if (r7 == 0) goto L7f
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r7 = r7.H()
            if (r7 == 0) goto L7f
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            throw r6
        L7f:
            if (r5 != 0) goto L82
            return r6
        L82:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L8a
            q0.c.j(r5, r6)
            throw r5
        L8a:
            q0.c.j(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.e(K5.k, K5.i, U3.c):java.io.Serializable");
    }

    public static final InterfaceC0329h f(InterfaceC0329h interfaceC0329h) {
        if (interfaceC0329h instanceof W) {
            return interfaceC0329h;
        }
        if (!(interfaceC0329h instanceof C0328g)) {
            return new C0328g(interfaceC0329h);
        }
        ((C0328g) interfaceC0329h).getClass();
        return interfaceC0329h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0055, B:29:0x006a, B:31:0x0072, B:20:0x0046, B:24:0x0051), top: B:47:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(K5.InterfaceC0330i r6, J5.u r7, boolean r8, S3.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof K5.C0333l
            if (r0 == 0) goto L13
            r0 = r9
            K5.l r0 = (K5.C0333l) r0
            int r1 = r0.f4828p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4828p = r1
            goto L18
        L13:
            K5.l r0 = new K5.l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4827o
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4828p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f4826n
            J5.d r6 = r0.f4825m
            J5.u r7 = r0.f4824l
            K5.i r2 = r0.f4823k
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f4826n
            J5.d r6 = r0.f4825m
            J5.u r7 = r0.f4824l
            K5.i r2 = r0.f4823k
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            P3.r.Y(r9)
            boolean r9 = r6 instanceof K5.a0
            if (r9 != 0) goto L98
            J5.d r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f4823k = r6     // Catch: java.lang.Throwable -> L34
            r0.f4824l = r7     // Catch: java.lang.Throwable -> L34
            r0.f4825m = r9     // Catch: java.lang.Throwable -> L34
            r0.f4826n = r8     // Catch: java.lang.Throwable -> L34
            r0.f4828p = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            goto L86
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f4823k = r2     // Catch: java.lang.Throwable -> L34
            r0.f4824l = r7     // Catch: java.lang.Throwable -> L34
            r0.f4825m = r6     // Catch: java.lang.Throwable -> L34
            r0.f4826n = r8     // Catch: java.lang.Throwable -> L34
            r0.f4828p = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L86:
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            r7.e(r6)
        L8d:
            O3.C r6 = O3.C.a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            l4.AbstractC1420H.l(r7, r6)
        L97:
            throw r9
        L98:
            K5.a0 r6 = (K5.a0) r6
            java.lang.Throwable r6 = r6.f4798k
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.g(K5.i, J5.u, boolean, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(K5.InterfaceC0329h r6, U3.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof K5.C0345y
            if (r0 == 0) goto L13
            r0 = r7
            K5.y r0 = (K5.C0345y) r0
            int r1 = r0.f4874n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4874n = r1
            goto L18
        L13:
            K5.y r0 = new K5.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4873m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4874n
            F2.G r3 = L5.c.f6161b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            F.b r6 = r0.f4872l
            kotlin.jvm.internal.x r1 = r0.f4871k
            P3.r.Y(r7)     // Catch: L5.a -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            P3.r.Y(r7)
            kotlin.jvm.internal.x r7 = new kotlin.jvm.internal.x
            r7.<init>()
            r7.f12720k = r3
            F.b r2 = new F.b
            r5 = 1
            r2.<init>(r5, r7)
            r0.f4871k = r7     // Catch: L5.a -> L56
            r0.f4872l = r2     // Catch: L5.a -> L56
            r0.f4874n = r4     // Catch: L5.a -> L56
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: L5.a -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r1 = r7
            goto L65
        L56:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r2
        L5a:
            K5.i r2 = r7.f6156k
            if (r2 != r6) goto L72
            S3.h r6 = r0.getContext()
            H5.D.m(r6)
        L65:
            java.lang.Object r6 = r1.f12720k
            if (r6 == r3) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.h(K5.h, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(K5.InterfaceC0329h r6, e4.n r7, S3.c r8) {
        /*
            boolean r0 = r8 instanceof K5.C0346z
            if (r0 == 0) goto L13
            r0 = r8
            K5.z r0 = (K5.C0346z) r0
            int r1 = r0.f4878n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4878n = r1
            goto L18
        L13:
            K5.z r0 = new K5.z
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4877m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4878n
            F2.G r3 = L5.c.f6161b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            K5.x r6 = r0.f4876l
            kotlin.jvm.internal.x r7 = r0.f4875k
            P3.r.Y(r8)     // Catch: L5.a -> L2d
            goto L65
        L2d:
            r8 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            P3.r.Y(r8)
            kotlin.jvm.internal.x r8 = new kotlin.jvm.internal.x
            r8.<init>()
            r8.f12720k = r3
            K5.x r2 = new K5.x
            r5 = 0
            r2.<init>(r7, r8, r5)
            r0.f4875k = r8     // Catch: L5.a -> L56
            r0.f4876l = r2     // Catch: L5.a -> L56
            r0.f4878n = r4     // Catch: L5.a -> L56
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: L5.a -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r7 = r8
            goto L65
        L56:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r2
        L5a:
            K5.i r1 = r8.f6156k
            if (r1 != r6) goto L72
            S3.h r6 = r0.getContext()
            H5.D.m(r6)
        L65:
            java.lang.Object r6 = r7.f12720k
            if (r6 == r3) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L72:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.i(K5.h, e4.n, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(K5.InterfaceC0329h r5, e4.n r6, U3.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof K5.B
            if (r0 == 0) goto L13
            r0 = r7
            K5.B r0 = (K5.B) r0
            int r1 = r0.f4738n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4738n = r1
            goto L18
        L13:
            K5.B r0 = new K5.B
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4737m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4738n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            K5.x r5 = r0.f4736l
            kotlin.jvm.internal.x r6 = r0.f4735k
            P3.r.Y(r7)     // Catch: L5.a -> L2b
            goto L61
        L2b:
            r7 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            P3.r.Y(r7)
            kotlin.jvm.internal.x r7 = new kotlin.jvm.internal.x
            r7.<init>()
            K5.x r2 = new K5.x
            r4 = 1
            r2.<init>(r6, r7, r4)
            r0.f4735k = r7     // Catch: L5.a -> L52
            r0.f4736l = r2     // Catch: L5.a -> L52
            r0.f4738n = r3     // Catch: L5.a -> L52
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: L5.a -> L52
            if (r5 != r1) goto L50
            return r1
        L50:
            r6 = r7
            goto L61
        L52:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L56:
            K5.i r1 = r7.f6156k
            if (r1 != r5) goto L64
            S3.h r5 = r0.getContext()
            H5.D.m(r5)
        L61:
            java.lang.Object r5 = r6.f12720k
            return r5
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.N.j(K5.h, e4.n, U3.c):java.lang.Object");
    }

    public static final InterfaceC0329h k(J j7, S3.h hVar, int i7, J5.c cVar) {
        return ((i7 == 0 || i7 == -3) && cVar == J5.c.f4299k) ? j7 : new L5.j(j7, hVar, i7, cVar);
    }

    public static final I l(C0332k c0332k, M5.c cVar, V v5, Float f5) {
        J5.i.f4336b.getClass();
        J5.h hVar = J5.h.a;
        J5.c cVar2 = J5.c.f4299k;
        F.w wVar = new F.w(28, c0332k, S3.i.f8767k);
        Y yB = b(f5);
        H5.D.w(cVar, (S3.h) wVar.f2038m, v5.equals(Q.a) ? H5.B.f3790k : H5.B.f3793n, new E(v5, (InterfaceC0329h) wVar.f2037l, yB, f5, null));
        return new I(yB);
    }
}
