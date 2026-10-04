package A3;

import L.AbstractC0384j0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import P3.F;
import b1.AbstractC0703b;
import com.kusukanime.data.SocialPrefs;
import e6.AbstractC0839c;
import h0.C0998u;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.plugins.websocket.BuildersKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import l4.AbstractC1420H;
import l4.InterfaceC1425d;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: A3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0006a implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f132k;

    public /* synthetic */ C0006a(int i7) {
        this.f132k = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        S3.b bVar;
        switch (this.f132k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    H2.b("Cari anime atau episode…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p, 6, 0, 131070);
                }
                return C.a;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    AbstractC0384j0.a(F.A(), null, null, ((N) c0510p2.k(P.a)).a, c0510p2, 48, 4);
                }
                return C.a;
            case 2:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    AbstractC0384j0.a(P3.r.w(), "Hapus kata kunci", null, 0L, c0510p3, 48, 12);
                }
                return C.a;
            case 3:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    AbstractC0384j0.a(P3.r.w(), "Hapus dari riwayat", androidx.compose.foundation.layout.c.j(a0.n.a, 16), ((N) c0510p4.k(P.a)).f5260s, c0510p4, 432, 0);
                }
                return C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    H2.b("Log crash", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p5, 6, 0, 131070);
                }
                return C.a;
            case 5:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    H2.b("BARU", androidx.compose.foundation.layout.a.i(a0.n.a, 8, 3), ((N) c0510p6.k(P.a)).f5248g, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p6.k(N2.a)).f5223o, c0510p6, 54, 0, 65528);
                }
                return C.a;
            case 6:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    H2.b("Resolusi Default", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p7, 6, 0, 131070);
                }
                return C.a;
            case 7:
                C0510p c0510p8 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    H2.b("Durasi Intro & Outro", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p8, 6, 0, 131070);
                }
                return C.a;
            case 8:
                C0510p c0510p9 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    H2.b("Keluar?", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p9, 6, 0, 131070);
                }
                return C.a;
            case 9:
                C0510p c0510p10 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p10.y()) {
                    c0510p10.M();
                } else {
                    H2.b("Kamu harus login lagi buat bookmark/komen.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p10, 6, 0, 131070);
                }
                return C.a;
            case 10:
                C0510p c0510p11 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p11.y()) {
                    c0510p11.M();
                } else {
                    a0.i iVar = a0.b.f10385o;
                    a0.n nVar = a0.n.a;
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                    int i7 = c0510p11.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p11.m();
                    a0.q qVarC = a0.a.c(c0510p11, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p11.V();
                    if (c0510p11.f7127O) {
                        c0510p11.l(c2362i);
                    } else {
                        c0510p11.e0();
                    }
                    C0486d.R(c0510p11, C2363j.f17875f, interfaceC2173HE);
                    C0486d.R(c0510p11, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p11.f7127O || !kotlin.jvm.internal.l.a(c0510p11.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p11, i7, c2361h);
                    }
                    C0486d.R(c0510p11, C2363j.f17873d, qVarC);
                    AbstractC0384j0.a(AbstractC1420H.B(), null, androidx.compose.foundation.layout.c.j(nVar, 32), C0998u.f11830c, c0510p11, 3504, 0);
                    c0510p11.p(true);
                }
                return C.a;
            case 11:
                C0510p c0510p12 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p12.y()) {
                    c0510p12.M();
                } else {
                    H2.b(SocialPrefs.TELEGRAM_HANDLE, androidx.compose.foundation.layout.a.i(a0.n.a, 12, 5), ((N) c0510p12.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p12.k(N2.a)).f5222n, c0510p12, 54, 0, 65528);
                }
                return C.a;
            case 12:
                ((Integer) obj2).getClass();
                D3.t.a(C0486d.V(1), (C0510p) obj);
                return C.a;
            case 13:
                ((Integer) obj2).getClass();
                D3.t.b(C0486d.V(1), (C0510p) obj);
                return C.a;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 15:
                return ((S3.h) obj).plus((S3.f) obj2);
            case 16:
                return ((S3.h) obj).plus((S3.f) obj2);
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 18:
                S3.f fVar = (S3.f) obj2;
                if (!(fVar instanceof Q5.a)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case 19:
                S3.f fVar2 = (S3.f) obj2;
                if (fVar2 instanceof Q5.a) {
                    return (Q5.a) fVar2;
                }
                return null;
            case 20:
                return (M5.u) obj;
            case 21:
                String str = (String) obj;
                S3.f fVar3 = (S3.f) obj2;
                kotlin.jvm.internal.l.f("acc", str);
                kotlin.jvm.internal.l.f("element", fVar3);
                if (str.length() == 0) {
                    return fVar3.toString();
                }
                return str + ", " + fVar3;
            case 22:
                S3.h hVar = (S3.h) obj;
                S3.f fVar4 = (S3.f) obj2;
                kotlin.jvm.internal.l.f("acc", hVar);
                kotlin.jvm.internal.l.f("element", fVar4);
                S3.h hVarMinusKey = hVar.minusKey(fVar4.getKey());
                S3.i iVar2 = S3.i.f8767k;
                if (hVarMinusKey == iVar2) {
                    return fVar4;
                }
                S3.d dVar = S3.d.f8766k;
                S3.e eVar = (S3.e) hVarMinusKey.get(dVar);
                if (eVar == null) {
                    bVar = new S3.b(fVar4, hVarMinusKey);
                } else {
                    S3.h hVarMinusKey2 = hVarMinusKey.minusKey(dVar);
                    if (hVarMinusKey2 == iVar2) {
                        return new S3.b(eVar, fVar4);
                    }
                    bVar = new S3.b(eVar, new S3.b(fVar4, hVarMinusKey2));
                }
                return bVar;
            case 23:
                InterfaceC1425d interfaceC1425d = (InterfaceC1425d) obj;
                List list = (List) obj2;
                kotlin.jvm.internal.l.f("clazz", interfaceC1425d);
                kotlin.jvm.internal.l.f("types", list);
                ArrayList arrayListQ = q0.c.Q(AbstractC0839c.a, list, true);
                kotlin.jvm.internal.l.c(arrayListQ);
                return q0.c.J(interfaceC1425d, arrayListQ, new P3.w(1, list));
            case 24:
                InterfaceC1425d interfaceC1425d2 = (InterfaceC1425d) obj;
                List list2 = (List) obj2;
                kotlin.jvm.internal.l.f("clazz", interfaceC1425d2);
                kotlin.jvm.internal.l.f("types", list2);
                ArrayList arrayListQ2 = q0.c.Q(AbstractC0839c.a, list2, true);
                kotlin.jvm.internal.l.c(arrayListQ2);
                KSerializer kSerializerJ = q0.c.J(interfaceC1425d2, arrayListQ2, new P3.w(2, list2));
                if (kSerializerJ != null) {
                    return n6.m.K(kSerializerJ);
                }
                return null;
            case 25:
                return HttpRequestRetryConfig.modifyRequest$lambda$0((HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            case 26:
                return BuildersKt.webSocket$lambda$8$lambda$7((URLBuilder) obj, (URLBuilder) obj2);
            case 27:
                return BuildersKt.webSocketSession$lambda$2$lambda$1((URLBuilder) obj, (URLBuilder) obj2);
            case 28:
                return Character.valueOf(ConnectionOptions.knownTypes$lambda$2((O3.l) obj, ((Integer) obj2).intValue()));
            default:
                return Boolean.valueOf(ConnectionOptions.Companion.parseSlow$lambda$1(((Character) obj).charValue(), ((Integer) obj2).intValue()));
        }
    }
}
