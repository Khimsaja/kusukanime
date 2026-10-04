package Z5;

import android.content.Context;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.GoogleAuth;
import com.kusukanime.data.HistoryRow;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import io.github.jan.supabase.SupabaseClient;
import io.ktor.client.engine.okhttp.OkHttpEngineKt;
import io.ktor.http.ContentType;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.websocket.WebSocketExtensionFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o3.AbstractC1634a;
import o3.C1641h;
import p3.C1784b;
import p3.C1786d;
import p3.C1788f;
import p3.C1789g;
import u3.C2082g;
import u3.C2084i;
import z5.C2508m;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10277k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f10279m;

    public /* synthetic */ A(int i7, Object obj, Object obj2) {
        this.f10277k = i7;
        this.f10278l = obj;
        this.f10279m = obj2;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        String[] strArrNames;
        OtaInfo latest;
        switch (this.f10277k) {
            case 0:
                B b4 = (B) this.f10278l;
                b4.getClass();
                Enum[] enumArr = b4.a;
                C0656z c0656z = new C0656z((String) this.f10279m, enumArr.length);
                for (Enum r02 : enumArr) {
                    c0656z.b(r02.name(), false);
                }
                return c0656z;
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                a6.d dVar = (a6.d) this.f10279m;
                a6.j jVar = dVar.a;
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f10278l;
                b6.v.q(dVar, serialDescriptor);
                int iF = serialDescriptor.f();
                for (int i7 = 0; i7 < iF; i7++) {
                    List listI = serialDescriptor.i(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listI) {
                        if (obj instanceof a6.t) {
                            arrayList.add(obj);
                        }
                    }
                    a6.t tVar = (a6.t) P3.q.M0(arrayList);
                    if (tVar != null && (strArrNames = tVar.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = kotlin.jvm.internal.l.a(serialDescriptor.c(), X5.i.f9950h) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String str3 = "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.g(i7) + " is already one of the names for " + str2 + ' ' + serialDescriptor.g(((Number) P3.E.m0(str, linkedHashMap)).intValue()) + " in " + serialDescriptor;
                                kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str3);
                                throw new V5.m(str3);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? P3.z.f7780k : linkedHashMap;
            case 2:
                return OkHttpEngineKt.convertToOkHttpBody$lambda$3((S3.h) this.f10278l, (OutgoingContent) this.f10279m);
            case 3:
                return Url.encodedPath_delegate$lambda$3((List) this.f10278l, (Url) this.f10279m);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return ((WebSocketExtensionFactory) this.f10278l).install((e4.k) this.f10279m);
            case 5:
                G2.E e7 = (G2.E) this.f10278l;
                e7.l((String) this.f10279m, new C1641h(e7, 15));
                return O3.C.a;
            case 6:
                C1789g c1789g = (C1789g) this.f10278l;
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) this.f10279m;
                kotlin.jvm.internal.l.f("onOk", interfaceC0821a);
                SupabaseClient orNull = SbClient.INSTANCE.getOrNull();
                if (orNull == null) {
                    K5.Y y7 = c1789g.f14350b;
                    C1784b c1784b = new C1784b("Supabase belum siap, coba lagi");
                    y7.getClass();
                    y7.i(null, c1784b);
                } else {
                    AbstractC1634a.f13599d = false;
                    AbstractC1634a.f13600e = null;
                    GoogleAuth googleAuth = GoogleAuth.INSTANCE;
                    Context context = c1789g.f14353e;
                    if (context == null) {
                        K5.Y y8 = c1789g.f14350b;
                        C1784b c1784b2 = new C1784b("Context belum siap, coba lagi");
                        y8.getClass();
                        y8.i(null, c1784b2);
                    } else if (googleAuth.open(context)) {
                        K5.Y y9 = c1789g.f14350b;
                        C1786d c1786d = C1786d.a;
                        y9.getClass();
                        y9.i(null, c1786d);
                        H5.D.x(androidx.lifecycle.J.h(c1789g), null, new C1788f(orNull, c1789g, interfaceC0821a, null), 3);
                    } else {
                        K5.Y y10 = c1789g.f14350b;
                        C1784b c1784b3 = new C1784b("Tidak ada browser untuk membuka login Google");
                        y10.getClass();
                        y10.i(null, c1784b3);
                    }
                }
                return O3.C.a;
            case 7:
                s3.N n7 = (s3.N) this.f10278l;
                String str4 = (String) this.f10279m;
                Context context2 = n7.f15606h;
                if (context2 != null) {
                    H5.D.x(androidx.lifecycle.J.h(n7), null, new s3.L(n7, context2, str4, null), 3);
                }
                return O3.C.a;
            case 8:
                ((O.Z) this.f10279m).setValue(Boolean.FALSE);
                io.ktor.http.c cVar = new io.ktor.http.c(17);
                C2084i c2084i = (C2084i) this.f10278l;
                H5.D.x(androidx.lifecycle.J.h(c2084i), null, new C2082g(c2084i, cVar, null), 3);
                return O3.C.a;
            case 9:
                ((e4.k) this.f10278l).invoke(((AnimeItem) this.f10279m).getDetailSlug());
                return O3.C.a;
            case 10:
                ((O.Z) this.f10279m).setValue(Boolean.FALSE);
                io.ktor.http.c cVar2 = new io.ktor.http.c(17);
                w3.y yVar = (w3.y) this.f10278l;
                H5.D.x(androidx.lifecycle.J.h(yVar), null, new w3.v(yVar, cVar2, null), 3);
                return O3.C.a;
            case 11:
                ((e4.k) this.f10278l).invoke(((HistoryRow) this.f10279m).getEpisode_slug());
                return O3.C.a;
            case 12:
                x3.h hVar = (x3.h) this.f10278l;
                Context context3 = (Context) this.f10279m;
                kotlin.jvm.internal.l.f("ctx", context3);
                OtaCheck otaCheck = (OtaCheck) hVar.f17330b.getValue();
                if (otaCheck != null && (latest = otaCheck.getLatest()) != null) {
                    context3.getSharedPreferences("ota", 0).edit().putInt("skipped_code", latest.getVersion_code()).apply();
                }
                hVar.f();
                return O3.C.a;
            case 13:
                OtaCheck otaCheck2 = (OtaCheck) ((O.Z) this.f10279m).getValue();
                if (otaCheck2 == null || !otaCheck2.getForce()) {
                    ((x3.h) this.f10278l).f();
                }
                return O3.C.a;
            case 14:
                ((e4.k) this.f10278l).invoke((StreamItem) this.f10279m);
                return O3.C.a;
            case 15:
                ((kotlin.jvm.internal.u) this.f10278l).f12717k = -1.0f;
                ((kotlin.jvm.internal.u) this.f10279m).f12717k = -1.0f;
                return O3.C.a;
            default:
                return ((C2508m) this.f10278l).a((String) this.f10279m);
        }
    }
}
