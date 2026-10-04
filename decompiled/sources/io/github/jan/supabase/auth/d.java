package io.github.jan.supabase.auth;

import A3.u;
import A3.v;
import D.z0;
import H1.G;
import O.H;
import O.Z;
import O3.C;
import P3.r;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.media3.exoplayer.ExoPlayer;
import b1.AbstractC0702a;
import com.kusukanime.data.OtaInfo;
import e4.k;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import p.C1724K;
import s0.C1955C;
import s3.T;
import t3.p;
import w.C2165f;
import w3.j;
import x.C2233g;
import z5.AbstractC2510o;
import z5.C2508m;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12067k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12070n;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i7) {
        this.f12067k = i7;
        this.f12069m = obj;
        this.f12068l = obj2;
        this.f12070n = obj3;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        long j7;
        int i7 = 4;
        int i8 = 2;
        C c2 = C.a;
        Object obj2 = this.f12070n;
        Object obj3 = this.f12068l;
        Object obj4 = this.f12069m;
        switch (this.f12067k) {
            case 0:
                return AuthenticatedSupabaseApi.rawRequest$lambda$0((String) obj4, (k) obj3, (AuthenticatedSupabaseApi) obj2, (HttpRequestBuilder) obj);
            case 1:
                return HttpCacheKt.mergedHeadersLookup$lambda$0((OutgoingContent) obj4, (k) obj3, (k) obj2, (String) obj);
            case 2:
                C2165f c2165f = (C2165f) obj;
                l.f("$this$LazyRow", c2165f);
                List list = (List) obj2;
                c2165f.x0(list.size(), new C1724K(14, new io.ktor.network.sockets.b(29), list), new u(4, list), new W.a(true, -632812321, new v(list, (String) obj4, (k) obj3, i8)));
                return c2;
            case 3:
                C2233g c2233g = (C2233g) obj;
                l.f("$this$LazyVerticalGrid", c2233g);
                List list2 = (List) obj4;
                c2233g.w0(list2.size(), new C1724K(15, new T(0), list2), new u(5, list2), new W.a(true, 699646206, new v(list2, (Map) obj2, (k) obj3, 3)));
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C2165f c2165f2 = (C2165f) obj;
                l.f("$this$LazyRow", c2165f2);
                List list3 = (List) ((Z) obj4).getValue();
                c2165f2.x0(list3.size(), new C1724K(17, new T(2), list3), new u(7, list3), new W.a(true, -632812321, new v(list3, (p) obj3, (Z) obj2, i7)));
                return c2;
            case 5:
                String str = (String) obj;
                l.f("raw", str);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i < length) {
                    char cCharAt = str.charAt(i);
                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                String lowerCase = AbstractC2510o.I0(20, sb.toString()).toLowerCase(Locale.ROOT);
                l.e("toLowerCase(...)", lowerCase);
                ((Z) obj3).setValue(lowerCase);
                if (((String) ((Z) obj2).getValue()) != null) {
                    ((j) obj4).f16988j.h(null);
                }
                return c2;
            case 6:
                l.f("$this$DisposableEffect", (H) obj);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
                x3.d dVar = new x3.d((OtaInfo) obj3, (Z) obj2);
                int i9 = Build.VERSION.SDK_INT;
                Context context = (Context) obj4;
                if (i9 >= 33) {
                    AbstractC0702a.c(context, dVar, intentFilter);
                } else if (i9 >= 26) {
                    context.registerReceiver(dVar, intentFilter, r.N(context), null);
                } else {
                    context.registerReceiver(dVar, intentFilter, r.N(context), null);
                }
                return new z0(11, context, dVar);
            default:
                i = g0.c.d(((g0.c) obj).a) < ((float) ((int) (((C1955C) obj4).f15436F >> 32))) / 2.0f ? 1 : 0;
                G g4 = (G) ((ExoPlayer) obj3);
                long jS0 = g4.S0();
                if (i != 0) {
                    j7 = jS0 - 10000;
                    if (j7 < 0) {
                        j7 = 0;
                    }
                } else {
                    j7 = jS0 + 10000;
                }
                g4.D0(5, j7);
                Integer numValueOf = Integer.valueOf(i != 0 ? -10 : 10);
                C2508m c2508m = y3.C.a;
                ((Z) obj2).setValue(numValueOf);
                return c2;
        }
    }

    public /* synthetic */ d(List list, String str, k kVar) {
        this.f12067k = 2;
        this.f12070n = list;
        this.f12069m = str;
        this.f12068l = kVar;
    }

    public /* synthetic */ d(List list, Map map, k kVar) {
        this.f12067k = 3;
        this.f12069m = list;
        this.f12070n = map;
        this.f12068l = kVar;
    }
}
