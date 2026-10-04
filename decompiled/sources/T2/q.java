package T2;

import L.C0407p0;
import O.C0486d;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AbstractC0703b;
import coil.compose.ContentPainterElement;
import com.kusukanime.KusuApp;
import com.kusukanime.data.ImgLoader;
import io.ktor.utils.io.ByteChannelKt;
import w0.C2178M;
import w0.C2191i;
import w0.InterfaceC2192j;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public abstract class q {
    public static final p a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final w f9026b = new w();

    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(T2.r r22, java.lang.String r23, a0.q r24, e4.k r25, a0.d r26, w0.InterfaceC2192j r27, O.C0510p r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.q.a(T2.r, java.lang.String, a0.q, e4.k, a0.d, w0.j, O.p, int, int):void");
    }

    public static final void b(Object obj, String str, a0.q qVar, C0510p c0510p, int i7) {
        C2178M c2178m = C2191i.a;
        c0510p.S(1451072229);
        a aVar = a.f8995n;
        a0.i iVar = a0.b.f10385o;
        w wVar = f9026b;
        S2.f fVarG = (S2.f) c0510p.k(y.a);
        if (fVarG == null) {
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            S2.f fVar = S2.a.f8727b;
            if (fVar == null) {
                synchronized (S2.a.a) {
                    try {
                        fVar = S2.a.f8727b;
                        if (fVar != null) {
                            fVarG = fVar;
                        } else {
                            Object applicationContext = context.getApplicationContext();
                            S2.g gVar = applicationContext instanceof S2.g ? (S2.g) applicationContext : null;
                            fVarG = gVar != null ? ImgLoader.INSTANCE.get((KusuApp) gVar) : new B0.b(context).g();
                            S2.a.f8727b = fVarG;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                fVarG = fVar;
            }
        }
        int i8 = i7 << 3;
        int i9 = (i7 & 112) | 520 | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192);
        c0510p.S(2032051394);
        r rVar = new r(obj, wVar, fVarG);
        int i10 = i9 >> 3;
        a(rVar, str, qVar, aVar, iVar, c2178m, c0510p, (i9 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | ((((i7 >> 27) & 14) << 27) & 1879048192), 0);
        c0510p.p(false);
        c0510p.p(false);
    }

    public static final void c(a0.q qVar, o oVar, String str, a0.d dVar, InterfaceC2192j interfaceC2192j, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(777774312);
        if ((i7 & 14) == 0) {
            i8 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 112) == 0) {
            i8 |= c0510p.f(oVar) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i8 |= c0510p.f(str) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i8 |= c0510p.f(dVar) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i8 |= c0510p.f(interfaceC2192j) ? 16384 : 8192;
        }
        if ((458752 & i7) == 0) {
            i8 |= c0510p.c(1.0f) ? 131072 : 65536;
        }
        if ((3670016 & i7) == 0) {
            i8 |= c0510p.f(null) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((29360128 & i7) == 0) {
            i8 |= c0510p.g(true) ? 8388608 : 4194304;
        }
        if ((i8 & 23967451) == 4793490 && c0510p.y()) {
            c0510p.M();
        } else {
            e3.f fVar = z.f9047b;
            a0.q qVarK = q0.c.p(str != null ? F0.k.a(qVar, false, new F0.l(str, 6)) : qVar).k(new ContentPainterElement(oVar, dVar, interfaceC2192j));
            b bVar = b.a;
            c0510p.S(544976794);
            int i9 = c0510p.f7128P;
            a0.q qVarC = a0.a.c(c0510p, qVarK);
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.S(1405779621);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(new B.e(17, c2362i));
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, bVar);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            c0510p.p(true);
            c0510p.p(false);
            c0510p.p(false);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0407p0(qVar, oVar, str, dVar, interfaceC2192j, i7, 1);
        }
    }

    public static void d(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + AbstractC0703b.j("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }
}
