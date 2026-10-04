package B0;

import A4.AbstractC0011d;
import A4.j;
import B1.K;
import C2.H;
import D6.r;
import F1.k;
import F1.n;
import F1.p;
import H1.G;
import H1.d0;
import H4.w;
import L2.e;
import O1.B;
import O3.q;
import P3.y;
import P4.o;
import R4.C0577h;
import R4.C0583n;
import R4.C0591w;
import R4.J;
import R4.U;
import R4.Z;
import R4.c0;
import T4.f;
import T4.i;
import U4.c;
import U4.d;
import X4.AbstractC0615l;
import X4.C0611h;
import X4.C0617n;
import android.R;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.Surface;
import b1.AbstractC0703b;
import b5.g;
import b5.h;
import d3.C0791c;
import e4.InterfaceC0821a;
import f1.AbstractC0870c;
import g3.AbstractC0945d;
import g3.C0949h;
import io.ktor.http.ContentType;
import j3.E;
import j3.X;
import j5.AbstractC1368w;
import j5.C1366u;
import j5.InterfaceC1346a;
import j5.InterfaceC1348c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.l;
import m5.C1523l;
import n5.AbstractC1586x;
import n6.m;
import p.AbstractC1755i;
import q4.AbstractC1857a;
import r0.C1861b;
import u4.AbstractC2115v;
import u4.M;
import x4.C2255A;
import y1.C2393o;
import y1.N;
import y1.P;
import z4.C2489a;
import z4.C2490b;
import z4.C2491c;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class b implements InterfaceC1346a, InterfaceC1348c {

    /* renamed from: k, reason: collision with root package name */
    public final Object f275k;

    /* renamed from: l, reason: collision with root package name */
    public Object f276l;

    /* renamed from: m, reason: collision with root package name */
    public Object f277m;

    /* renamed from: n, reason: collision with root package name */
    public Object f278n;

    /* renamed from: o, reason: collision with root package name */
    public Object f279o;

    /* renamed from: p, reason: collision with root package name */
    public Object f280p;

    public b(C2255A c2255a, A2.b bVar, C1523l c1523l, C2490b c2490b) {
        this.f275k = c2490b;
        this.f276l = c1523l.b(new j(12, this));
        this.f277m = c2255a;
        this.f278n = bVar;
        this.f279o = new e(c2255a, bVar);
        this.f280p = f.f9107g;
    }

    public static p a(DataInputStream dataInputStream) throws IOException {
        int i7 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i8 = 0; i8 < i7; i8++) {
            String utf = dataInputStream.readUTF();
            int i9 = dataInputStream.readInt();
            if (i9 < 0) {
                throw new IOException(AbstractC0703b.g(i9, "Invalid value size: "));
            }
            int iMin = Math.min(i9, 10485760);
            byte[] bArrCopyOf = K.f302c;
            int i10 = 0;
            while (i10 != i9) {
                int i11 = i10 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                dataInputStream.readFully(bArrCopyOf, i10, iMin);
                iMin = Math.min(i9 - i11, 10485760);
                i10 = i11;
            }
            map.put(utf, bArrCopyOf);
        }
        return new p(map);
    }

    public static void b(p pVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = pVar.f2210b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static final g c(b bVar, W4.e eVar, Object obj) {
        g gVarB = h.a.b(obj, (C2255A) bVar.f277m);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + eVar;
        l.f(ContentType.Message.TYPE, str);
        return new b5.j(str);
    }

    public static void d(int i7, Menu menu) {
        int i8;
        int iB = AbstractC1755i.b(i7);
        int iB2 = AbstractC1755i.b(i7);
        if (iB2 == 0) {
            i8 = R.string.copy;
        } else if (iB2 == 1) {
            i8 = R.string.paste;
        } else if (iB2 == 2) {
            i8 = R.string.cut;
        } else {
            if (iB2 != 3) {
                throw new r();
            }
            i8 = R.string.selectAll;
        }
        menu.add(0, iB, AbstractC1755i.b(i7), i8).setShowAsAction(1);
    }

    public static void e(Menu menu, int i7, InterfaceC0821a interfaceC0821a) {
        if (interfaceC0821a != null && menu.findItem(AbstractC1755i.b(i7)) == null) {
            d(i7, menu);
        } else {
            if (interfaceC0821a != null || menu.findItem(AbstractC1755i.b(i7)) == null) {
                return;
            }
            menu.removeItem(AbstractC1755i.b(i7));
        }
    }

    public static /* synthetic */ List i(b bVar, AbstractC1368w abstractC1368w, o oVar, Boolean bool, boolean z7, int i7) {
        boolean z8 = (i7 & 4) == 0;
        if ((i7 & 16) != 0) {
            bool = null;
        }
        return bVar.h(abstractC1368w, oVar, z8, false, bool, (i7 & 32) != 0 ? false : z7);
    }

    public static B j(G g4, j3.G g7, B b4, N n7) {
        int iB;
        P pU0 = g4.U0();
        g4.u1();
        if (g4.f3264q0.a.p()) {
            iB = 0;
        } else {
            d0 d0Var = g4.f3264q0;
            iB = d0Var.a.b(d0Var.f3426b.a);
        }
        Object objL = pU0.p() ? null : pU0.l(iB);
        int iB2 = (g4.c1() || pU0.p()) ? -1 : pU0.f(iB, n7, false).b(K.F(g4.S0()) - n7.f17950e);
        for (int i7 = 0; i7 < g7.size(); i7++) {
            B b7 = (B) g7.get(i7);
            if (q(b7, objL, g4.c1(), g4.P0(), g4.Q0(), iB2)) {
                return b7;
            }
        }
        if (g7.isEmpty() && b4 != null && q(b4, objL, g4.c1(), g4.P0(), g4.Q0(), iB2)) {
            return b4;
        }
        return null;
    }

    public static o l(AbstractC0615l abstractC0615l, T4.g gVar, i iVar, int i7, boolean z7) {
        l.f("proto", abstractC0615l);
        l.f("nameResolver", gVar);
        AbstractC0703b.w(i7, "kind");
        if (abstractC0615l instanceof C0583n) {
            C0611h c0611h = V4.g.a;
            V4.e eVarA = V4.g.a((C0583n) abstractC0615l, gVar, iVar);
            if (eVarA != null) {
                return P3.r.u(eVarA);
            }
        } else if (abstractC0615l instanceof R4.B) {
            C0611h c0611h2 = V4.g.a;
            V4.e eVarC = V4.g.c((R4.B) abstractC0615l, gVar, iVar);
            if (eVarC != null) {
                return P3.r.u(eVarC);
            }
        } else if (abstractC0615l instanceof J) {
            C0617n c0617n = U4.j.f9300d;
            l.e("propertySignature", c0617n);
            d dVar = (d) android.support.v4.media.session.b.w(abstractC0615l, c0617n);
            if (dVar != null) {
                int iB = AbstractC1755i.b(i7);
                if (iB == 1) {
                    return m.L((J) abstractC0615l, gVar, iVar, true, true, z7);
                }
                if (iB != 2) {
                    if (iB != 3 || (dVar.f9253l & 8) != 8) {
                        return null;
                    }
                    c cVar = dVar.f9257p;
                    l.e("getSetter(...)", cVar);
                    return new o(gVar.a(cVar.f9246m).concat(gVar.a(cVar.f9247n)));
                }
                if (dVar.i()) {
                    c cVar2 = dVar.f9256o;
                    l.e("getGetter(...)", cVar2);
                    return new o(gVar.a(cVar2.f9246m).concat(gVar.a(cVar2.f9247n)));
                }
            }
        }
        return null;
    }

    public static boolean q(B b4, Object obj, boolean z7, int i7, int i8, int i9) {
        if (!b4.a.equals(obj)) {
            return false;
        }
        int i10 = b4.f7252b;
        if (z7 && i10 == i7 && b4.f7253c == i8) {
            return true;
        }
        return !z7 && i10 == -1 && b4.f7255e == i9;
    }

    @Override // j5.InterfaceC1348c
    public List D(AbstractC1368w abstractC1368w, C0591w c0591w) {
        l.f("container", abstractC1368w);
        String strA = abstractC1368w.a.a(c0591w.f8632n);
        String strB = V4.b.b(((C1366u) abstractC1368w).f12474f.b());
        l.f("desc", strB);
        return i(this, abstractC1368w, new o(strA + '#' + strB), null, false, 60);
    }

    @Override // j5.InterfaceC1348c
    public ArrayList G0(U u5, T4.g gVar) {
        l.f("proto", u5);
        l.f("nameResolver", gVar);
        Object objK = u5.k(U4.j.f9302f);
        l.e("getExtension(...)", objK);
        Iterable<C0577h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(P3.r.p(iterable, 10));
        for (C0577h c0577h : iterable) {
            l.c(c0577h);
            arrayList.add(((e) this.f279o).d1(c0577h, gVar));
        }
        return arrayList;
    }

    @Override // j5.InterfaceC1346a
    public Object L(AbstractC1368w abstractC1368w, J j7, AbstractC1586x abstractC1586x) {
        l.f("proto", j7);
        return t(abstractC1368w, j7, 3, abstractC1586x, P4.a.f7781l);
    }

    @Override // j5.InterfaceC1346a
    public Object S(AbstractC1368w abstractC1368w, J j7, AbstractC1586x abstractC1586x) {
        l.f("proto", j7);
        return t(abstractC1368w, j7, 2, abstractC1586x, P4.a.f7782m);
    }

    @Override // j5.InterfaceC1348c
    public List W(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7) {
        l.f("proto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        return v(abstractC1368w, abstractC0615l, i7, abstractC0615l instanceof R4.B ? ((R4.B) abstractC0615l).f8140y.size() : abstractC0615l instanceof J ? ((J) abstractC0615l).f8224y.size() : 0);
    }

    @Override // j5.InterfaceC1348c
    public List Y(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7, int i8, c0 c0Var) {
        l.f("callableProto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        return v(abstractC1368w, abstractC0615l, i7, i8);
    }

    @Override // j5.InterfaceC1348c
    public List Y0(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7) {
        l.f("proto", abstractC0615l);
        AbstractC0703b.w(i7, "kind");
        if (i7 == 2) {
            return w(abstractC1368w, (J) abstractC0615l, P4.b.f7784k);
        }
        o oVarL = l(abstractC0615l, abstractC1368w.a, abstractC1368w.f12478b, i7, false);
        return oVarL == null ? y.f7779k : i(this, abstractC1368w, oVarL, null, false, 60);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // j5.InterfaceC1348c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d0(j5.AbstractC1368w r7, X4.AbstractC0615l r8, int r9, int r10, R4.c0 r11) {
        /*
            r6 = this;
            java.lang.String r11 = "callableProto"
            kotlin.jvm.internal.l.f(r11, r8)
            java.lang.String r11 = "kind"
            b1.AbstractC0703b.w(r9, r11)
            boolean r11 = r8 instanceof R4.B
            r0 = 0
            if (r11 == 0) goto L19
            r1 = r8
            R4.B r1 = (R4.B) r1
            java.util.List r1 = r1.f8140y
            int r1 = r1.size()
            goto L28
        L19:
            boolean r1 = r8 instanceof R4.J
            if (r1 == 0) goto L27
            r1 = r8
            R4.J r1 = (R4.J) r1
            java.util.List r1 = r1.f8224y
            int r1 = r1.size()
            goto L28
        L27:
            r1 = r0
        L28:
            r2 = 64
            r3 = 32
            r4 = 1
            if (r11 == 0) goto L3e
            r11 = r8
            R4.B r11 = (R4.B) r11
            int r11 = r11.f8128m
            r5 = r11 & 32
            if (r5 != r3) goto L39
            goto L3c
        L39:
            r11 = r11 & r2
            if (r11 != r2) goto L64
        L3c:
            r0 = r4
            goto L64
        L3e:
            boolean r11 = r8 instanceof R4.J
            if (r11 == 0) goto L50
            r11 = r8
            R4.J r11 = (R4.J) r11
            int r11 = r11.f8212m
            r5 = r11 & 32
            if (r5 != r3) goto L4c
            goto L4f
        L4c:
            r11 = r11 & r2
            if (r11 != r2) goto L64
        L4f:
            goto L3c
        L50:
            boolean r11 = r8 instanceof R4.C0583n
            if (r11 == 0) goto L6b
            r11 = r7
            j5.u r11 = (j5.C1366u) r11
            R4.j r2 = R4.EnumC0579j.ENUM_CLASS
            R4.j r3 = r11.f12475g
            if (r3 != r2) goto L5f
            r0 = 2
            goto L64
        L5f:
            boolean r11 = r11.f12476h
            if (r11 == 0) goto L64
            goto L3c
        L64:
            int r1 = r1 + r0
            int r1 = r1 + r10
            java.util.List r7 = r6.v(r7, r8, r9, r1)
            return r7
        L6b:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported message: "
            r9.<init>(r10)
            java.lang.Class r8 = r8.getClass()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.b.d0(j5.w, X4.l, int, int, R4.c0):java.util.List");
    }

    public void f(H h7, B b4, P p7) {
        if (b4 == null) {
            return;
        }
        if (p7.b(b4.a) != -1) {
            h7.m(b4, p7);
            return;
        }
        P p8 = (P) ((j3.c0) this.f277m).get(b4);
        if (p8 != null) {
            h7.m(b4, p8);
        }
    }

    public S2.m g() {
        C0791c c0791c = (C0791c) this.f276l;
        q qVarC = (q) this.f277m;
        if (qVarC == null) {
            qVarC = z1.c.C(new S2.d(this, 0));
        }
        q qVar = qVarC;
        q qVarC2 = (q) this.f278n;
        if (qVarC2 == null) {
            qVarC2 = z1.c.C(new S2.d(this, 1));
        }
        q qVar2 = qVarC2;
        O3.i iVarC = (O3.f) this.f279o;
        if (iVarC == null) {
            iVarC = z1.c.C(S2.e.f8734l);
        }
        O3.i iVar = iVarC;
        y yVar = y.f7779k;
        return new S2.m((Context) this.f275k, c0791c, qVar, qVar2, iVar, new S2.b(yVar, yVar, yVar, yVar, yVar), (C0949h) this.f280p);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List h(j5.AbstractC1368w r9, P4.o r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f280p
            r7 = r0
            T4.f r7 = (T4.f) r7
            java.lang.Object r0 = r8.f275k
            r6 = r0
            z4.b r6 = (z4.C2490b) r6
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            z4.c r9 = n6.d.G(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L2d
            boolean r9 = r1 instanceof j5.C1366u
            r11 = 0
            if (r9 == 0) goto L2c
            r9 = r1
            j5.u r9 = (j5.C1366u) r9
            u4.M r9 = r9.f12479c
            boolean r12 = r9 instanceof P4.n
            if (r12 == 0) goto L26
            P4.n r9 = (P4.n) r9
            goto L27
        L26:
            r9 = r11
        L27:
            if (r9 == 0) goto L2c
            z4.c r9 = r9.f7811k
            goto L2d
        L2c:
            r9 = r11
        L2d:
            P3.y r11 = P3.y.f7779k
            if (r9 != 0) goto L32
            goto L46
        L32:
            java.lang.Object r12 = r8.f276l
            m5.e r12 = (m5.C1516e) r12
            java.lang.Object r9 = r12.invoke(r9)
            P4.c r9 = (P4.c) r9
            java.util.HashMap r9 = r9.a
            java.lang.Object r9 = r9.get(r10)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L47
        L46:
            return r11
        L47:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.b.h(j5.w, P4.o, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    @Override // j5.InterfaceC1348c
    public ArrayList j0(Z z7, T4.g gVar) {
        l.f("proto", z7);
        l.f("nameResolver", gVar);
        Object objK = z7.k(U4.j.f9304h);
        l.e("getExtension(...)", objK);
        Iterable<C0577h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(P3.r.p(iterable, 10));
        for (C0577h c0577h : iterable) {
            l.c(c0577h);
            arrayList.add(((e) this.f279o).d1(c0577h, gVar));
        }
        return arrayList;
    }

    public k k(String str) {
        return (k) ((HashMap) this.f275k).get(str);
    }

    public k m(String str) {
        HashMap map = (HashMap) this.f275k;
        k kVar = (k) map.get(str);
        if (kVar != null) {
            return kVar;
        }
        SparseArray sparseArray = (SparseArray) this.f276l;
        int size = sparseArray.size();
        int i7 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i7 < size && i7 == sparseArray.keyAt(i7)) {
                i7++;
            }
            iKeyAt = i7;
        }
        k kVar2 = new k(iKeyAt, str, p.f2209c);
        map.put(str, kVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f278n).put(iKeyAt, true);
        ((n) this.f279o).f(kVar2);
        return kVar2;
    }

    public void n(long j7) {
        n nVar;
        n nVar2 = (n) this.f279o;
        nVar2.d(j7);
        n nVar3 = (n) this.f280p;
        if (nVar3 != null) {
            nVar3.d(j7);
        }
        boolean zA = nVar2.a();
        SparseArray sparseArray = (SparseArray) this.f276l;
        HashMap map = (HashMap) this.f275k;
        if (zA || (nVar = (n) this.f280p) == null || !nVar.a()) {
            nVar2.g(map, sparseArray);
        } else {
            ((n) this.f280p).g(map, sparseArray);
            nVar2.c(map);
        }
        n nVar4 = (n) this.f280p;
        if (nVar4 != null) {
            nVar4.h();
            this.f280p = null;
        }
    }

    public boolean o(W4.b bVar) {
        if (bVar.e() != null && l.a(bVar.f().b(), "Container")) {
            C2491c c2491cQ = z1.c.q((C2490b) this.f275k, bVar, (f) this.f280p);
            if (c2491cQ != null) {
                LinkedHashSet linkedHashSet = AbstractC1857a.a;
                Class cls = c2491cQ.a;
                l.f("klass", cls);
                Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                l.e("getDeclaredAnnotations(...)", declaredAnnotations);
                boolean z7 = false;
                for (Annotation annotation : declaredAnnotations) {
                    l.c(annotation);
                    if (AbstractC0011d.a(m.F(m.B(annotation))).equals(w.f3754b)) {
                        z7 = true;
                    }
                }
                if (z7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j5.InterfaceC1348c
    public List p(AbstractC1368w abstractC1368w, J j7) {
        l.f("proto", j7);
        return w(abstractC1368w, j7, P4.b.f7786m);
    }

    public E4.h r(W4.b bVar, M m7, List list) {
        l.f("result", list);
        return new E4.h(this, AbstractC2115v.f((C2255A) this.f277m, bVar, (A2.b) this.f278n), bVar, list, m7);
    }

    public E4.h s(W4.b bVar, C2489a c2489a, List list) {
        l.f("result", list);
        if (AbstractC1857a.a.contains(bVar)) {
            return null;
        }
        return r(bVar, c2489a, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(j5.AbstractC1368w r10, R4.J r11, int r12, n5.AbstractC1586x r13, e4.n r14) {
        /*
            r9 = this;
            T4.b r0 = T4.e.f9069B
            int r1 = r11.f8213n
            java.lang.Boolean r5 = r0.c(r1)
            boolean r6 = V4.g.d(r11)
            java.lang.Object r0 = r9.f280p
            r8 = r0
            T4.f r8 = (T4.f) r8
            java.lang.Object r0 = r9.f275k
            r7 = r0
            z4.b r7 = (z4.C2490b) r7
            r3 = 1
            r4 = 1
            r2 = r10
            z4.c r10 = n6.d.G(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L37
            boolean r10 = r2 instanceof j5.C1366u
            if (r10 == 0) goto L36
            r10 = r2
            j5.u r10 = (j5.C1366u) r10
            u4.M r10 = r10.f12479c
            boolean r1 = r10 instanceof P4.n
            if (r1 == 0) goto L30
            P4.n r10 = (P4.n) r10
            goto L31
        L30:
            r10 = r0
        L31:
            if (r10 == 0) goto L36
            z4.c r10 = r10.f7811k
            goto L37
        L36:
            r10 = r0
        L37:
            if (r10 != 0) goto L3a
            goto L6a
        L3a:
            Q4.b r1 = r10.f19031b
            java.lang.Object r1 = r1.f8006d
            T4.f r1 = (T4.f) r1
            T4.f r3 = P4.e.f7794e
            java.lang.String r4 = "version"
            kotlin.jvm.internal.l.f(r4, r3)
            int r4 = r3.f9062b
            int r5 = r3.f9063c
            int r3 = r3.f9064d
            boolean r1 = r1.a(r4, r5, r3)
            T4.i r3 = r2.f12478b
            T4.g r2 = r2.a
            P4.o r11 = l(r11, r2, r3, r12, r1)
            if (r11 != 0) goto L5c
            goto L6a
        L5c:
            java.lang.Object r12 = r9.f276l
            m5.e r12 = (m5.C1516e) r12
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Object r10 = r14.invoke(r10, r11)
            if (r10 != 0) goto L6b
        L6a:
            return r0
        L6b:
            boolean r11 = r4.AbstractC1891t.a(r13)
            if (r11 == 0) goto Lc3
            b5.g r10 = (b5.g) r10
            boolean r11 = r10 instanceof b5.d
            if (r11 == 0) goto L87
            b5.y r11 = new b5.y
            b5.d r10 = (b5.d) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            byte r10 = r10.byteValue()
            r11.<init>(r10)
            return r11
        L87:
            boolean r11 = r10 instanceof b5.v
            if (r11 == 0) goto L9b
            b5.y r11 = new b5.y
            b5.v r10 = (b5.v) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            short r10 = r10.shortValue()
            r11.<init>(r10)
            return r11
        L9b:
            boolean r11 = r10 instanceof b5.k
            if (r11 == 0) goto Laf
            b5.y r11 = new b5.y
            b5.k r10 = (b5.k) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11.<init>(r10)
            return r11
        Laf:
            boolean r11 = r10 instanceof b5.t
            if (r11 == 0) goto Lc3
            b5.y r11 = new b5.y
            b5.t r10 = (b5.t) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r11.<init>(r12)
            return r11
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.b.t(j5.w, R4.J, int, n5.x, e4.n):java.lang.Object");
    }

    @Override // j5.InterfaceC1348c
    public List u(AbstractC1368w abstractC1368w, J j7) {
        l.f("proto", j7);
        return w(abstractC1368w, j7, P4.b.f7785l);
    }

    public List v(AbstractC1368w abstractC1368w, AbstractC0615l abstractC0615l, int i7, int i8) {
        o oVarL = l(abstractC0615l, abstractC1368w.a, abstractC1368w.f12478b, i7, false);
        if (oVarL == null) {
            return y.f7779k;
        }
        return i(this, abstractC1368w, new o(oVarL.a + '@' + i8), null, false, 60);
    }

    public List w(AbstractC1368w abstractC1368w, J j7, P4.b bVar) {
        Boolean boolC = T4.e.f9069B.c(j7.f8213n);
        boolean zD = V4.g.d(j7);
        P4.b bVar2 = P4.b.f7784k;
        y yVar = y.f7779k;
        i iVar = abstractC1368w.f12478b;
        T4.g gVar = abstractC1368w.a;
        if (bVar == bVar2) {
            o oVarL = m.L(j7, gVar, iVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (oVarL != null) {
                return i(this, abstractC1368w, oVarL, boolC, zD, 8);
            }
        } else {
            o oVarL2 = m.L(j7, gVar, iVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (oVarL2 != null) {
                if (AbstractC2510o.W(oVarL2.a, "$delegate", false) == (bVar == P4.b.f7786m)) {
                    return h(abstractC1368w, oVarL2, true, true, boolC, zD);
                }
            }
        }
        return yVar;
    }

    public void x(String str) {
        HashMap map = (HashMap) this.f275k;
        k kVar = (k) map.get(str);
        if (kVar != null && kVar.f2198c.isEmpty() && kVar.f2199d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f278n;
            int i7 = kVar.a;
            boolean z7 = sparseBooleanArray.get(i7);
            ((n) this.f279o).e(kVar, z7);
            SparseArray sparseArray = (SparseArray) this.f276l;
            if (z7) {
                sparseArray.remove(i7);
                sparseBooleanArray.delete(i7);
            } else {
                sparseArray.put(i7, null);
                ((SparseBooleanArray) this.f277m).put(i7, true);
            }
        }
    }

    @Override // j5.InterfaceC1348c
    public ArrayList x0(C1366u c1366u) {
        l.f("container", c1366u);
        M m7 = c1366u.f12479c;
        P4.n nVar = m7 instanceof P4.n ? (P4.n) m7 : null;
        C2491c c2491c = nVar != null ? nVar.f7811k : null;
        if (c2491c == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + c1366u.f12474f.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c2491c.a;
        l.f("klass", cls);
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        l.e("getDeclaredAnnotations(...)", declaredAnnotations);
        for (Annotation annotation : declaredAnnotations) {
            l.c(annotation);
            Class clsF = m.F(m.B(annotation));
            E4.h hVarS = s(AbstractC0011d.a(clsF), new C2489a(annotation), arrayList);
            if (hVarS != null) {
                AbstractC0870c.b0(hVarS, annotation, clsF);
            }
        }
        return arrayList;
    }

    public void y() {
        ((n) this.f279o).b((HashMap) this.f275k);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f277m;
        int size = sparseBooleanArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((SparseArray) this.f276l).remove(sparseBooleanArray.keyAt(i7));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f278n).clear();
    }

    public void z(P p7) {
        H h7 = new H(4);
        if (((j3.G) this.f276l).isEmpty()) {
            f(h7, (B) this.f279o, p7);
            if (!Objects.equals((B) this.f280p, (B) this.f279o)) {
                f(h7, (B) this.f280p, p7);
            }
            if (!Objects.equals((B) this.f278n, (B) this.f279o) && !Objects.equals((B) this.f278n, (B) this.f280p)) {
                f(h7, (B) this.f278n, p7);
            }
        } else {
            for (int i7 = 0; i7 < ((j3.G) this.f276l).size(); i7++) {
                f(h7, (B) ((j3.G) this.f276l).get(i7), p7);
            }
            if (!((j3.G) this.f276l).contains((B) this.f278n)) {
                f(h7, (B) this.f278n, p7);
            }
        }
        this.f277m = h7.c();
    }

    public b(C1861b c1861b) {
        g0.d dVar = g0.d.f11658e;
        this.f275k = c1861b;
        this.f276l = dVar;
        this.f277m = null;
        this.f278n = null;
        this.f279o = null;
        this.f280p = null;
    }

    public b(M1.p pVar, MediaFormat mediaFormat, C2393o c2393o, Surface surface, MediaCrypto mediaCrypto, B2.l lVar) {
        this.f275k = pVar;
        this.f276l = mediaFormat;
        this.f277m = c2393o;
        this.f278n = surface;
        this.f279o = mediaCrypto;
        this.f280p = lVar;
    }

    public b(Context context) {
        this.f275k = context.getApplicationContext();
        this.f276l = AbstractC0945d.a;
        this.f277m = null;
        this.f278n = null;
        this.f279o = null;
        this.f280p = new C0949h();
    }

    public b(D1.b bVar, File file) {
        this.f275k = new HashMap();
        this.f276l = new SparseArray();
        this.f277m = new SparseBooleanArray();
        this.f278n = new SparseBooleanArray();
        F1.l lVar = new F1.l(bVar);
        File file2 = new File(file, "cached_content_index.exi");
        F1.m mVar = new F1.m();
        mVar.f2205b = null;
        mVar.f2206c = null;
        mVar.f2207d = new F.w(file2);
        this.f279o = lVar;
        this.f280p = mVar;
    }

    public b(i6.d dVar) {
        l.f("taskRunner", dVar);
        this.f275k = dVar;
        this.f280p = m6.h.a;
    }

    public b(N n7) {
        this.f275k = n7;
        E e7 = j3.G.f12277l;
        this.f276l = X.f12304o;
        this.f277m = j3.c0.f12326q;
    }
}
