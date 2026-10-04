package B3;

import H5.D;
import K5.Y;
import Z5.AbstractC0632e0;
import Z5.C0628c0;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import e4.InterfaceC0821a;
import io.ktor.client.engine.okhttp.OkHttpEngineKt;
import io.ktor.http.cio.CIOHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.parsing.ParserDslKt;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.cio.FileChannelsKt;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.AbstractC1420H;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import p.I0;
import q3.C1855f;
import u3.C2083h;
import u3.C2084i;
import w6.AbstractC2217b;
import w6.K;
import z3.C2487c;
import z3.C2488d;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f519k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f520l;

    public /* synthetic */ q(int i7, Object obj) {
        this.f519k = i7;
        this.f520l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // e4.InterfaceC0821a
    public final Object invoke() throws IOException {
        int iI0;
        Iterator it;
        Throwable th;
        w6.o oVar;
        O3.l lVar;
        Throwable th2;
        Throwable th3;
        int iG;
        O3.l lVar2;
        int i7 = 4;
        int i8 = 3;
        O3.l lVar3 = null;
        O3.C c2 = O3.C.a;
        ?? r62 = 0;
        Object[] objArr = 0;
        Object obj = this.f520l;
        switch (this.f519k) {
            case 0:
                C c4 = (C) obj;
                Context context = c4.f435l;
                if (context != null) {
                    D.x(J.h(c4), null, new z(c4, context, null), 3);
                }
                return c2;
            case 1:
                L2.f fVar = (L2.f) obj;
                fVar.f().a(new L2.b(fVar, 0));
                return c2;
            case 2:
                return ParserDslKt.maybe$lambda$0((e4.k) obj);
            case 3:
                return kotlin.jvm.internal.l.i((Object[]) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                V5.d dVar = (V5.d) obj;
                X5.g gVarJ = AbstractC1420H.j("kotlinx.serialization.Polymorphic", X5.c.f9927h, new SerialDescriptor[0], new A3.d(i8, dVar));
                InterfaceC1425d interfaceC1425d = dVar.a;
                kotlin.jvm.internal.l.f("context", interfaceC1425d);
                return new X5.b(gVarJ, interfaceC1425d);
            case 5:
                return AbstractC1420H.j("io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider.Config", X5.c.f9928i, new SerialDescriptor[0], new V5.e((V5.f) obj, objArr == true ? 1 : 0));
            case 6:
                return ((InterfaceC1444w) ((ArrayList) obj).get(0)).c();
            case 7:
                X5.g gVar = (X5.g) obj;
                return Integer.valueOf(AbstractC0632e0.e(gVar, gVar.f9947k));
            case 8:
                return AbstractC1420H.j("kotlin.Unit", X5.j.f9954k, new SerialDescriptor[0], new A3.d(4, (C0628c0) obj));
            case 9:
                return J.g((W) obj);
            case 10:
                return OkHttpEngineKt.convertToOkHttpBody$lambda$2((OutgoingContent) obj);
            case 11:
                return CIOHeaders.names_delegate$lambda$1((CIOHeaders) obj);
            case 12:
                return FileChannelsKt.readChannel$lambda$0((File) obj);
            case 13:
                ((C1855f) obj).e();
                return c2;
            case 14:
                C2084i c2084i = (C2084i) obj;
                D.x(J.h(c2084i), null, new C2083h(c2084i, null), 3);
                return c2;
            case 15:
                v3.z zVar = (v3.z) obj;
                zVar.f16620h = 1;
                zVar.f16621i = false;
                P3.y yVar = P3.y.f7779k;
                Y y7 = zVar.f16614b;
                y7.getClass();
                y7.i(null, yVar);
                zVar.e();
                return c2;
            case 16:
                w3.y yVar2 = (w3.y) obj;
                Context context2 = yVar2.f17091s;
                if (context2 != null) {
                    D.x(J.h(yVar2), null, new w3.u(yVar2, context2, null), 3);
                }
                return c2;
            case 17:
                x6.e eVar = (x6.e) obj;
                ClassLoader classLoader = eVar.f17531l;
                Enumeration<URL> resources = classLoader.getResources("");
                kotlin.jvm.internal.l.e("getResources(...)", resources);
                ArrayList list = Collections.list(resources);
                kotlin.jvm.internal.l.e("list(...)", list);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    w6.o oVar2 = eVar.f17532m;
                    if (!zHasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        kotlin.jvm.internal.l.e("getResources(...)", resources2);
                        ArrayList list2 = Collections.list(resources2);
                        kotlin.jvm.internal.l.e("list(...)", list2);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            URL url = (URL) it3.next();
                            kotlin.jvm.internal.l.c(url);
                            String string = url.toString();
                            kotlin.jvm.internal.l.e("toString(...)", string);
                            if (AbstractC2517v.T(string, "jar:file:", r62) && (iI0 = AbstractC2510o.i0(r62, 6, string, "!")) != -1) {
                                String str = w6.y.f17190l;
                                String strSubstring = string.substring(i7, iI0);
                                kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                                w6.y yVarU = I0.u(new File(URI.create(strSubstring)));
                                w6.u uVarS = oVar2.s(yVarU);
                                try {
                                    it = it3;
                                    long jB = uVarS.b() - 22;
                                    long j7 = 0;
                                    if (jB < 0) {
                                        throw new IOException("not a zip: size=" + uVarS.b());
                                    }
                                    long jMax = Math.max(jB - 65536, 0L);
                                    while (true) {
                                        long j8 = j7;
                                        w6.C c6 = AbstractC2217b.c(uVarS.e(jB));
                                        try {
                                            if (c6.g() == 101010256) {
                                                boolean zJ = c6.j() & 65535;
                                                boolean zJ2 = c6.j() & 65535;
                                                long j9 = c6.j() & 65535;
                                                w6.o oVar3 = oVar2;
                                                if (j9 != (c6.j() & 65535) || zJ != 0 || zJ2 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                c6.n(4L);
                                                int iJ = c6.j() & 65535;
                                                T1.r rVar = new T1.r(iJ, j9, c6.g() & 4294967295L);
                                                c6.m(iJ);
                                                c6.close();
                                                long j10 = jB - 20;
                                                if (j10 > j8) {
                                                    w6.C c7 = AbstractC2217b.c(uVarS.e(j10));
                                                    try {
                                                        if (c7.g() == 117853008) {
                                                            int iG2 = c7.g();
                                                            long jI = c7.i();
                                                            if (c7.g() != 1 || iG2 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            w6.C c8 = AbstractC2217b.c(uVarS.e(jI));
                                                            try {
                                                                iG = c8.g();
                                                            } catch (Throwable th4) {
                                                                th3 = th4;
                                                                try {
                                                                } catch (Throwable th5) {
                                                                    q0.c.j(th3, th5);
                                                                }
                                                            }
                                                            if (iG != 101075792) {
                                                                throw new IOException("bad zip: expected " + x6.b.d(101075792) + " but was " + x6.b.d(iG));
                                                            }
                                                            c8.n(12L);
                                                            int iG3 = c8.g();
                                                            int iG4 = c8.g();
                                                            long jI2 = c8.i();
                                                            if (jI2 != c8.i() || iG3 != 0 || iG4 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            c8.n(8L);
                                                            T1.r rVar2 = new T1.r(iJ, jI2, c8.i());
                                                            try {
                                                                th3 = null;
                                                            } catch (Throwable th6) {
                                                                th3 = th6;
                                                            }
                                                            rVar = rVar2;
                                                            if (th3 != null) {
                                                                throw th3;
                                                            }
                                                        }
                                                        try {
                                                            th2 = null;
                                                        } catch (Throwable th7) {
                                                            th2 = th7;
                                                        }
                                                    } catch (Throwable th8) {
                                                        try {
                                                        } catch (Throwable th9) {
                                                            q0.c.j(th8, th9);
                                                        }
                                                        th2 = th8;
                                                    }
                                                    if (th2 != null) {
                                                        throw th2;
                                                    }
                                                }
                                                T1.r rVar3 = rVar;
                                                ArrayList arrayList3 = new ArrayList();
                                                w6.C c9 = AbstractC2217b.c(uVarS.e(rVar3.f8945b));
                                                try {
                                                    long j11 = rVar3.a;
                                                    while (j8 < j11) {
                                                        x6.g gVarE = x6.b.e(c9);
                                                        if (gVarE.f17541h >= rVar3.f8945b) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                            break;
                                                        } else {
                                                            w6.y yVar3 = x6.e.f17530o;
                                                            if (I0.p(gVarE.a)) {
                                                                arrayList3.add(gVarE);
                                                            }
                                                            j8++;
                                                        }
                                                    }
                                                    try {
                                                        th = null;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                    }
                                                } catch (Throwable th11) {
                                                    try {
                                                    } catch (Throwable th12) {
                                                        q0.c.j(th11, th12);
                                                    }
                                                    th = th11;
                                                }
                                                if (th != null) {
                                                    throw th;
                                                }
                                                oVar = oVar3;
                                                K k7 = new K(yVarU, oVar, x6.b.b(arrayList3));
                                                try {
                                                    uVarS.close();
                                                } catch (Throwable unused) {
                                                }
                                                lVar = new O3.l(k7, x6.e.f17530o);
                                            } else {
                                                w6.o oVar4 = oVar2;
                                                c6.close();
                                                jB--;
                                                if (jB < jMax) {
                                                    throw new IOException("not a zip: end of central directory signature not found");
                                                }
                                                oVar2 = oVar4;
                                                j7 = j8;
                                            }
                                        } finally {
                                            c6.close();
                                        }
                                    }
                                } finally {
                                }
                            } else {
                                lVar = lVar3;
                                it = it3;
                                oVar = oVar2;
                            }
                            if (lVar != null) {
                                arrayList2.add(lVar);
                            }
                            oVar2 = oVar;
                            it3 = it;
                            i7 = 4;
                            lVar3 = null;
                            r62 = 0;
                        }
                        return P3.q.G0(arrayList, arrayList2);
                    }
                    URL url2 = (URL) it2.next();
                    kotlin.jvm.internal.l.c(url2);
                    if (kotlin.jvm.internal.l.a(url2.getProtocol(), "file")) {
                        String str2 = w6.y.f17190l;
                        lVar2 = new O3.l(oVar2, I0.u(new File(url2.toURI())));
                    } else {
                        lVar2 = null;
                    }
                    if (lVar2 != null) {
                        arrayList.add(lVar2);
                    }
                }
                break;
            case 18:
                return obj;
            default:
                C2488d c2488d = (C2488d) obj;
                Context context3 = c2488d.f19029h;
                if (context3 != null) {
                    D.x(J.h(c2488d), null, new C2487c(c2488d, context3, null), 3);
                }
                return c2;
        }
    }
}
