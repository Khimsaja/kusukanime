package O4;

import O3.AbstractC0552a;
import O3.C;
import O3.C0553b;
import b6.C0724E;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import n5.B;

/* loaded from: classes.dex */
public final class c {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f7552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7553c;

    public c(B b4, int i7, boolean z7) {
        this.f7553c = b4;
        this.f7552b = i7;
        this.a = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(O4.c r11, O3.C0553b r12, U3.a r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof b6.C0725F
            if (r0 == 0) goto L13
            r0 = r13
            b6.F r0 = (b6.C0725F) r0
            int r1 = r0.f10980r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10980r = r1
            goto L18
        L13:
            b6.F r0 = new b6.F
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f10978p
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f10980r
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L54
            int r11 = r0.f10977o
            java.lang.String r12 = r0.f10976n
            java.util.LinkedHashMap r2 = r0.f10975m
            O4.c r9 = r0.f10974l
            O3.b r10 = r0.f10973k
            P3.r.Y(r13)
            kotlinx.serialization.json.b r13 = (kotlinx.serialization.json.b) r13
            r2.put(r12, r13)
            java.lang.Object r12 = r9.f7553c
            V1.i r12 = (V1.i) r12
            byte r12 = r12.f()
            if (r12 == r7) goto L51
            if (r12 != r6) goto L47
            goto La3
        L47:
            java.lang.Object r11 = r9.f7553c
            V1.i r11 = (V1.i) r11
            java.lang.String r12 = "Expected end of the object or comma"
            V1.i.r(r11, r12, r3, r5, r4)
            throw r5
        L51:
            r3 = r11
            r11 = r9
            goto L75
        L54:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L5c:
            P3.r.Y(r13)
            java.lang.Object r13 = r11.f7553c
            V1.i r13 = (V1.i) r13
            byte r2 = r13.g(r4)
            byte r9 = r13.x()
            if (r9 == r7) goto Lbb
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r10 = r12
            r12 = r2
            r2 = r13
        L75:
            java.lang.Object r13 = r11.f7553c
            V1.i r13 = (V1.i) r13
            boolean r9 = r13.c()
            if (r9 == 0) goto La2
            boolean r12 = r11.a
            if (r12 == 0) goto L88
            java.lang.String r12 = r13.l()
            goto L8c
        L88:
            java.lang.String r12 = r13.j()
        L8c:
            r4 = 5
            r13.g(r4)
            r0.f10973k = r10
            r0.f10974l = r11
            r0.f10975m = r2
            r0.f10976n = r12
            r0.f10977o = r3
            r0.f10980r = r8
            r10.getClass()
            r10.f7514l = r0
            return r1
        La2:
            r9 = r11
        La3:
            java.lang.Object r11 = r9.f7553c
            V1.i r11 = (V1.i) r11
            if (r12 != r4) goto Lad
            r11.g(r6)
            goto Laf
        Lad:
            if (r12 == r7) goto Lb5
        Laf:
            kotlinx.serialization.json.c r11 = new kotlinx.serialization.json.c
            r11.<init>(r2)
            return r11
        Lb5:
            java.lang.String r12 = "object"
            b6.v.o(r11, r12)
            throw r5
        Lbb:
            java.lang.String r11 = "Unexpected leading comma"
            V1.i.r(r13, r11, r3, r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.a(O4.c, O3.b, U3.a):java.lang.Object");
    }

    public kotlinx.serialization.json.b b() throws Throwable {
        kotlinx.serialization.json.b cVar;
        Object obj;
        V1.i iVar = (V1.i) this.f7553c;
        byte bX = iVar.x();
        if (bX == 1) {
            return d(true);
        }
        if (bX == 0) {
            return d(false);
        }
        if (bX != 6) {
            if (bX == 8) {
                return c();
            }
            V1.i.r(iVar, "Cannot read Json element because of unexpected ".concat(b6.v.u(bX)), 0, null, 6);
            throw null;
        }
        int i7 = this.f7552b + 1;
        this.f7552b = i7;
        if (i7 == 200) {
            C0724E c0724e = new C0724E(this, null);
            T3.a aVar = AbstractC0552a.a;
            C0553b c0553b = new C0553b();
            c0553b.f7513k = c0724e;
            c0553b.f7514l = c0553b;
            T3.a aVar2 = AbstractC0552a.a;
            c0553b.f7515m = aVar2;
            while (true) {
                obj = c0553b.f7515m;
                S3.c cVar2 = c0553b.f7514l;
                if (cVar2 == null) {
                    break;
                }
                if (kotlin.jvm.internal.l.a(aVar2, obj)) {
                    try {
                        C0724E c0724e2 = c0553b.f7513k;
                        kotlin.jvm.internal.B.e(3, c0724e2);
                        C0724E c0724e3 = new C0724E(c0724e2.f10972m, cVar2);
                        c0724e3.f10971l = c0553b;
                        Object objInvokeSuspend = c0724e3.invokeSuspend(C.a);
                        if (objInvokeSuspend != T3.a.f9048k) {
                            cVar2.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        cVar2.resumeWith(P3.r.r(th));
                    }
                } else {
                    c0553b.f7515m = aVar2;
                    cVar2.resumeWith(obj);
                }
            }
            P3.r.Y(obj);
            cVar = (kotlinx.serialization.json.b) obj;
        } else {
            byte bG = iVar.g((byte) 6);
            if (iVar.x() == 4) {
                V1.i.r(iVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!iVar.c()) {
                    break;
                }
                String strL = this.a ? iVar.l() : iVar.j();
                iVar.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = iVar.f();
                if (bG != 4) {
                    if (bG != 7) {
                        V1.i.r(iVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                iVar.g((byte) 7);
            } else if (bG == 4) {
                b6.v.o(iVar, "object");
                throw null;
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMap);
        }
        this.f7552b--;
        return cVar;
    }

    public kotlinx.serialization.json.a c() {
        V1.i iVar = (V1.i) this.f7553c;
        byte bF = iVar.f();
        if (iVar.x() == 4) {
            V1.i.r(iVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (iVar.c()) {
            arrayList.add(b());
            bF = iVar.f();
            if (bF != 4) {
                boolean z7 = bF == 9;
                int i7 = iVar.f9380b;
                if (!z7) {
                    V1.i.r(iVar, "Expected end of the array or comma", i7, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            iVar.g((byte) 9);
        } else if (bF == 4) {
            b6.v.o(iVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public kotlinx.serialization.json.d d(boolean z7) {
        V1.i iVar = (V1.i) this.f7553c;
        String strL = (this.a || !z7) ? iVar.l() : iVar.j();
        return (z7 || !kotlin.jvm.internal.l.a(strL, "null")) ? new a6.r(strL, z7, null) : JsonNull.INSTANCE;
    }
}
