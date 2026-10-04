package o3;

import G2.E;
import G2.I;
import G2.Q;
import O3.C;
import com.kusukanime.data.ProfileRow;
import io.ktor.util.GzipHeaderFlags;

/* renamed from: o3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1641h implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13614k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f13615l;

    public /* synthetic */ C1641h(E e7, int i7) {
        this.f13614k = i7;
        this.f13615l = e7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13614k) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                E.m(this.f13615l, "detail/".concat(str), null, 6);
                break;
            case 1:
                String str2 = (String) obj;
                kotlin.jvm.internal.l.f("it", str2);
                E.m(this.f13615l, "detail/".concat(str2), null, 6);
                break;
            case 2:
                kotlin.jvm.internal.l.f("it", (ProfileRow) obj);
                this.f13615l.n();
                break;
            case 3:
                String str3 = (String) obj;
                kotlin.jvm.internal.l.f("it", str3);
                E.m(this.f13615l, "detail/".concat(str3), null, 6);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                String str4 = (String) obj;
                kotlin.jvm.internal.l.f("it", str4);
                E.m(this.f13615l, "detail/".concat(str4), null, 6);
                break;
            case 5:
                String str5 = (String) obj;
                kotlin.jvm.internal.l.f("it", str5);
                this.f13615l.l("genre/".concat(str5), new io.ktor.network.sockets.b(19));
                break;
            case 6:
                String str6 = (String) obj;
                kotlin.jvm.internal.l.f("it", str6);
                E.m(this.f13615l, "detail/".concat(str6), null, 6);
                break;
            case 7:
                String str7 = (String) obj;
                kotlin.jvm.internal.l.f("it", str7);
                E.m(this.f13615l, "detail/".concat(str7), null, 6);
                break;
            case 8:
                String str8 = (String) obj;
                kotlin.jvm.internal.l.f("it", str8);
                this.f13615l.l("genre/".concat(str8), new io.ktor.network.sockets.b(23));
                break;
            case 9:
                String str9 = (String) obj;
                kotlin.jvm.internal.l.f("it", str9);
                E.m(this.f13615l, "detail/".concat(str9), null, 6);
                break;
            case 10:
                String str10 = (String) obj;
                kotlin.jvm.internal.l.f("it", str10);
                E.m(this.f13615l, "detail/".concat(str10), null, 6);
                break;
            case 11:
                String str11 = (String) obj;
                kotlin.jvm.internal.l.f("it", str11);
                E.m(this.f13615l, "detail/".concat(str11), null, 6);
                break;
            case 12:
                String str12 = (String) obj;
                kotlin.jvm.internal.l.f("it", str12);
                E.m(this.f13615l, "detail/".concat(str12), null, 6);
                break;
            case 13:
                String str13 = (String) obj;
                kotlin.jvm.internal.l.f("it", str13);
                E.m(this.f13615l, "detail/".concat(str13), null, 6);
                break;
            case 14:
                String str14 = (String) obj;
                kotlin.jvm.internal.l.f("it", str14);
                E.m(this.f13615l, "detail/".concat(str14), null, 6);
                break;
            default:
                I i7 = (I) obj;
                kotlin.jvm.internal.l.f("$this$navigate", i7);
                i7.f2672d = this.f13615l.g().f2622t;
                i7.f2674f = false;
                Q q6 = new Q();
                q6.f2683b = true;
                i7.f2674f = q6.a;
                i7.f2675g = q6.f2683b;
                i7.f2670b = true;
                i7.f2671c = true;
                break;
        }
        return C.a;
    }
}
