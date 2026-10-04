package D;

import H0.C0214f;
import O.C0486d;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import android.view.KeyEvent;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import f1.AbstractC0870c;
import java.util.concurrent.atomic.AtomicReference;
import s0.C1956a;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: D.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0047d0 {
    public static final C0041a0 a = new C0041a0(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C1956a f1136b = new C1956a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f1137c = new P0(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r18, a0.q r19, H0.I r20, int r21, boolean r22, int r23, int r24, O.C0510p r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0047d0.a(java.lang.String, a0.q, H0.I, int, boolean, int, int, O.p, int, int):void");
    }

    public static final void b(H.S s7, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        W.a aVar2;
        C0510p c0510p2;
        c0510p.T(-1985516685);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(s7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
            aVar2 = aVar;
            c0510p2 = c0510p;
        } else {
            Object objH = c0510p.H();
            O.T t7 = C0502l.a;
            if (objH == t7) {
                objH = new r.l();
                c0510p.b0(objH);
            }
            r.l lVar = (r.l) objH;
            Object objH2 = c0510p.H();
            if (objH2 == t7) {
                objH2 = new B.e(1, lVar);
                c0510p.b0(objH2);
            }
            aVar2 = aVar;
            c0510p2 = c0510p;
            AbstractC0832b.b(lVar, (InterfaceC0821a) objH2, new A3.t(8, s7, lVar), null, s7.h(), aVar2, c0510p2, ((i8 << 12) & 458752) | 54);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(i7, 0, s7, aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x054f A[PHI: r10 r30 r31
      0x054f: PHI (r10v17 N0.l) = (r10v18 N0.l), (r10v19 N0.l) binds: [B:266:0x054d, B:263:0x053f] A[DONT_GENERATE, DONT_INLINE]
      0x054f: PHI (r30v9 int) = (r30v10 int), (r30v12 int) binds: [B:266:0x054d, B:263:0x053f] A[DONT_GENERATE, DONT_INLINE]
      0x054f: PHI (r31v11 D.g0) = (r31v12 D.g0), (r31v13 D.g0) binds: [B:266:0x054d, B:263:0x053f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x056e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0795 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x084e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x095a  */
    /* JADX WARN: Type inference failed for: r0v82, types: [a0.q] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r14v14, types: [O.p] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r7v0, types: [O.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(N0.w r62, e4.k r63, a0.q r64, H0.I r65, I1.e r66, e4.k r67, u.k r68, h0.C0975U r69, boolean r70, int r71, int r72, N0.l r73, D.C0049e0 r74, boolean r75, W.a r76, O.C0510p r77, int r78, int r79) {
        /*
            Method dump skipped, instructions count: 2507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0047d0.c(N0.w, e4.k, a0.q, H0.I, I1.e, e4.k, u.k, h0.U, boolean, int, int, N0.l, D.e0, boolean, W.a, O.p, int, int):void");
    }

    public static final void d(a0.q qVar, H.S s7, W.a aVar, C0510p c0510p, int i7) {
        c0510p.T(-20551815);
        int i8 = (c0510p.f(qVar) ? 4 : 2) | i7 | (c0510p.h(s7) ? 32 : 16);
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVar);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            b(s7, aVar, c0510p, (i8 >> 3) & 126);
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new K(qVar, s7, aVar, i7, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(H.S r13, O.C0510p r14, int r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0047d0.e(H.S, O.p, int):void");
    }

    public static final void f(H.S s7, boolean z7, C0510p c0510p, int i7) {
        int i8;
        N0 n0D;
        c0510p.T(626339208);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(s7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.g(z7) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else if (z7) {
            c0510p.R(-1286242594);
            C0053g0 c0053g0 = s7.f2915d;
            H0.F f5 = null;
            if (c0053g0 != null && (n0D = c0053g0.d()) != null) {
                H0.F f7 = n0D.a;
                C0053g0 c0053g02 = s7.f2915d;
                if (!(c0053g02 != null ? c0053g02.f1157p : true)) {
                    f5 = f7;
                }
            }
            if (f5 == null) {
                c0510p.R(-1285984396);
            } else {
                c0510p.R(-1285984395);
                if (H0.H.b(s7.j().f6896b)) {
                    c0510p.R(-1679637798);
                    c0510p.p(false);
                } else {
                    c0510p.R(-1680616096);
                    int iB = s7.f2913b.b((int) (s7.j().f6896b >> 32));
                    int iB2 = s7.f2913b.b((int) (s7.j().f6896b & 4294967295L));
                    S0.h hVarA = f5.a(iB);
                    S0.h hVarA2 = f5.a(Math.max(iB2 - 1, 0));
                    C0053g0 c0053g03 = s7.f2915d;
                    if (c0053g03 == null || !((Boolean) c0053g03.f1154m.getValue()).booleanValue()) {
                        c0510p.R(-1679975078);
                        c0510p.p(false);
                    } else {
                        c0510p.R(-1680216289);
                        P3.r.d(true, hVarA, s7, c0510p, ((i8 << 6) & 896) | 6);
                        c0510p.p(false);
                    }
                    C0053g0 c0053g04 = s7.f2915d;
                    if (c0053g04 == null || !((Boolean) c0053g04.f1155n.getValue()).booleanValue()) {
                        c0510p.R(-1679655654);
                        c0510p.p(false);
                    } else {
                        c0510p.R(-1679895904);
                        P3.r.d(false, hVarA2, s7, c0510p, ((i8 << 6) & 896) | 6);
                        c0510p.p(false);
                    }
                    c0510p.p(false);
                }
                C0053g0 c0053g05 = s7.f2915d;
                if (c0053g05 != null) {
                    boolean zA = kotlin.jvm.internal.l.a(s7.f2929r.a.a, s7.j().a.a);
                    C0493g0 c0493g0 = c0053g05.f1153l;
                    if (!zA) {
                        c0493g0.setValue(Boolean.FALSE);
                    }
                    if (c0053g05.b()) {
                        if (((Boolean) c0493g0.getValue()).booleanValue()) {
                            s7.o();
                        } else {
                            s7.k();
                        }
                    }
                }
            }
            c0510p.p(false);
            c0510p.p(false);
        } else {
            c0510p.R(651305535);
            c0510p.p(false);
            s7.k();
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new L(s7, z7, i7);
        }
    }

    public static final void g(C0053g0 c0053g0) {
        N0.B b4 = c0053g0.f1146e;
        if (b4 != null) {
            c0053g0.f1161t.invoke(N0.w.a((N0.w) c0053g0.f1145d.f6045l, null, 0L, 3));
            N0.x xVar = b4.a;
            AtomicReference atomicReference = xVar.f6898b;
            while (true) {
                if (atomicReference.compareAndSet(b4, null)) {
                    xVar.a.f();
                    break;
                } else if (atomicReference.get() != b4) {
                    break;
                }
            }
        }
        c0053g0.f1146e = null;
    }

    public static final g0.d h(T0.b bVar, int i7, N0.C c2, H0.F f5, boolean z7, int i8) {
        g0.d dVarC = f5 != null ? f5.c(c2.f6851b.b(i7)) : g0.d.f11658e;
        int iO = bVar.O(t0.a);
        float f7 = dVarC.a;
        return new g0.d(z7 ? (i8 - f7) - iO : f7, dVarC.f11659b, z7 ? i8 - f7 : iO + f7, dVarC.f11661d);
    }

    public static final boolean i(int i7, KeyEvent keyEvent) {
        return ((int) (q0.c.B(keyEvent) >> 32)) == i7;
    }

    public static final void j(N0.x xVar, C0053g0 c0053g0, N0.w wVar, N0.l lVar, N0.q qVar) {
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        C0056i c0056i = new C0056i(c0053g0.f1145d, c0053g0.f1161t, xVar2, 2);
        N0.r rVar = xVar.a;
        rVar.d(wVar, lVar, c0056i, c0053g0.f1162u);
        N0.B b4 = new N0.B(xVar, rVar);
        xVar.f6898b.set(b4);
        xVar2.f12720k = b4;
        c0053g0.f1146e = b4;
        q(c0053g0, wVar, qVar);
    }

    public static final int k(float f5) {
        return Math.round((float) Math.ceil(f5));
    }

    public static final N0.C l(I1.e eVar, C0214f c0214f) {
        eVar.getClass();
        int length = c0214f.a.length();
        int length2 = c0214f.a.length();
        int iMin = Math.min(length, 100);
        for (int i7 = 0; i7 < iMin; i7++) {
            t(i7, length2, i7);
        }
        t(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i8 = 0; i8 < iMin2; i8++) {
            u(i8, length, i8);
        }
        u(length2, length, length2);
        return new N0.C(c0214f, new P0(c0214f.a.length(), c0214f.a.length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(int r9, java.lang.String r10) {
        /*
            boolean r0 = p1.g.c()
            r1 = 0
            if (r0 == 0) goto L13
            p1.g r0 = p1.g.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L72
            p1.e r0 = r0.f14173e
            B2.l r2 = r0.f14166b
            r2.getClass()
            r0 = -1
            if (r9 < 0) goto L26
            int r3 = r10.length()
            if (r9 < r3) goto L28
        L26:
            r3 = r10
            goto L68
        L28:
            boolean r3 = r10 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L45
            r3 = r10
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r5 = r9 + 1
            java.lang.Class<p1.r> r6 = p1.r.class
            java.lang.Object[] r5 = r3.getSpans(r9, r5, r6)
            p1.r[] r5 = (p1.r[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L45
            r2 = r5[r4]
            int r2 = r3.getSpanEnd(r2)
            r3 = r10
            goto L69
        L45:
            int r3 = r9 + (-16)
            int r4 = java.lang.Math.max(r4, r3)
            int r3 = r10.length()
            int r5 = r9 + 16
            int r5 = java.lang.Math.min(r3, r5)
            p1.m r8 = new p1.m
            r8.<init>(r9)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r3 = r10
            java.lang.Object r10 = r2.J(r3, r4, r5, r6, r7, r8)
            p1.m r10 = (p1.m) r10
            int r2 = r10.f14182m
            goto L69
        L68:
            r2 = r0
        L69:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L70
            goto L73
        L70:
            r1 = r10
            goto L73
        L72:
            r3 = r10
        L73:
            if (r1 == 0) goto L7a
            int r9 = r1.intValue()
            return r9
        L7a:
            java.text.BreakIterator r10 = java.text.BreakIterator.getCharacterInstance()
            r10.setText(r3)
            int r9 = r10.following(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0047d0.m(int, java.lang.String):int");
    }

    public static final int n(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        while (i7 < length) {
            if (charSequence.charAt(i7) == '\n') {
                return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    public static final int o(CharSequence charSequence, int i7) {
        while (i7 > 0) {
            if (charSequence.charAt(i7 - 1) == '\n') {
                return i7;
            }
            i7--;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int p(int r11, java.lang.String r12) {
        /*
            boolean r0 = p1.g.c()
            r1 = 0
            if (r0 == 0) goto L13
            p1.g r0 = p1.g.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L78
            int r2 = r11 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            p1.e r0 = r0.f14173e
            B2.l r4 = r0.f14166b
            r4.getClass()
            r0 = -1
            if (r2 < 0) goto L2d
            int r5 = r12.length()
            if (r2 < r5) goto L2f
        L2d:
            r5 = r12
            goto L6e
        L2f:
            boolean r5 = r12 instanceof android.text.Spanned
            if (r5 == 0) goto L4b
            r5 = r12
            android.text.Spanned r5 = (android.text.Spanned) r5
            int r6 = r2 + 1
            java.lang.Class<p1.r> r7 = p1.r.class
            java.lang.Object[] r6 = r5.getSpans(r2, r6, r7)
            p1.r[] r6 = (p1.r[]) r6
            int r7 = r6.length
            if (r7 <= 0) goto L4b
            r2 = r6[r3]
            int r2 = r5.getSpanStart(r2)
            r5 = r12
            goto L6f
        L4b:
            int r5 = r2 + (-16)
            int r6 = java.lang.Math.max(r3, r5)
            int r3 = r12.length()
            int r5 = r2 + 16
            int r7 = java.lang.Math.min(r3, r5)
            p1.m r10 = new p1.m
            r10.<init>(r2)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.J(r5, r6, r7, r8, r9, r10)
            p1.m r12 = (p1.m) r12
            int r2 = r12.f14181l
            goto L6f
        L6e:
            r2 = r0
        L6f:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L76
            goto L79
        L76:
            r1 = r12
            goto L79
        L78:
            r5 = r12
        L79:
            if (r1 == 0) goto L80
            int r11 = r1.intValue()
            return r11
        L80:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.preceding(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0047d0.p(int, java.lang.String):int");
    }

    public static final void q(C0053g0 c0053g0, N0.w wVar, N0.q qVar) {
        Y.h hVarC = Y.s.c();
        e4.k kVarF = hVarC != null ? hVarC.f() : null;
        Y.h hVarD = Y.s.d(hVarC);
        try {
            N0 n0D = c0053g0.d();
            if (n0D == null) {
                return;
            }
            N0.B b4 = c0053g0.f1146e;
            if (b4 == null) {
                return;
            }
            w0.r rVarC = c0053g0.c();
            if (rVarC == null) {
                return;
            }
            r(wVar, c0053g0.a, n0D.a, rVarC, b4, c0053g0.b(), qVar);
        } finally {
            Y.s.f(hVarC, hVarD, kVarF);
        }
    }

    public static void r(N0.w wVar, C0069o0 c0069o0, H0.F f5, w0.r rVar, N0.B b4, boolean z7, N0.q qVar) {
        g0.d dVar;
        if (z7) {
            int iB = qVar.b(H0.H.d(wVar.f6896b));
            if (iB < f5.a.a.a.length()) {
                dVar = f5.b(iB);
            } else if (iB != 0) {
                dVar = f5.b(iB - 1);
            } else {
                dVar = new g0.d(0.0f, 0.0f, 1.0f, (int) (u0.a(c0069o0.f1254b, c0069o0.f1259g, c0069o0.f1260h, u0.a, 1) & 4294967295L));
            }
            long jS = rVar.S(AbstractC0832b.e(dVar.a, dVar.f11659b));
            g0.d dVarC = AbstractC0841b.c(AbstractC0832b.e(g0.c.d(jS), g0.c.e(jS)), AbstractC0870c.F(dVar.c(), dVar.b()));
            if (kotlin.jvm.internal.l.a((N0.B) b4.a.f6898b.get(), b4)) {
                b4.f6850b.g(dVarC);
            }
        }
    }

    public static final void s(int i7, int i8) {
        if (i7 > 0 && i8 > 0) {
            if (i7 > i8) {
                throw new IllegalArgumentException(A6.b.e(i7, i8, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i7 + " and maxLines " + i8 + " must be greater than zero").toString());
    }

    public static final void t(int i7, int i8, int i9) {
        if (i7 < 0 || i7 > i8) {
            throw new IllegalStateException(AbstractC0703b.l(v.c0.b("OffsetMapping.originalToTransformed returned invalid mapping: ", i9, " -> ", i7, " is not in range of transformed text [0, "), i8, ']').toString());
        }
    }

    public static final void u(int i7, int i8, int i9) {
        if (i7 < 0 || i7 > i8) {
            throw new IllegalStateException(AbstractC0703b.l(v.c0.b("OffsetMapping.transformedToOriginal returned invalid mapping: ", i9, " -> ", i7, " is not in range of original text [0, "), i8, ']').toString());
        }
    }
}
