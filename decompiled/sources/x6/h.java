package x6;

import e4.n;
import java.io.IOException;
import kotlin.jvm.internal.x;
import w6.C;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17551k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f17552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f17553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f17554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f17555o;

    public /* synthetic */ h(x xVar, C c2, x xVar2, x xVar3) {
        this.f17552l = xVar;
        this.f17553m = c2;
        this.f17554n = xVar2;
        this.f17555o = xVar3;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i7 = this.f17551k;
        int iIntValue = ((Integer) obj).intValue();
        Long l7 = (Long) obj2;
        switch (i7) {
            case 0:
                long jLongValue = l7.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C c2 = this.f17553m;
                    byte b4 = c2.readByte();
                    boolean z7 = (b4 & 1) == 1;
                    boolean z8 = (b4 & 2) == 2;
                    boolean z9 = (b4 & 4) == 4;
                    long j7 = z7 ? 5L : 1L;
                    if (z8) {
                        j7 += 4;
                    }
                    if (z9) {
                        j7 += 4;
                    }
                    if (jLongValue < j7) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z7) {
                        this.f17552l.f12720k = Integer.valueOf(c2.g());
                    }
                    if (z8) {
                        this.f17554n.f12720k = Integer.valueOf(c2.g());
                    }
                    if (z9) {
                        this.f17555o.f12720k = Integer.valueOf(c2.g());
                    }
                }
                return O3.C.a;
            default:
                long jLongValue2 = l7.longValue();
                if (iIntValue == 1) {
                    x xVar = this.f17552l;
                    if (xVar.f12720k != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C c4 = this.f17553m;
                    xVar.f12720k = Long.valueOf(c4.i());
                    this.f17554n.f12720k = Long.valueOf(c4.i());
                    this.f17555o.f12720k = Long.valueOf(c4.i());
                }
                return O3.C.a;
        }
    }

    public /* synthetic */ h(C c2, x xVar, x xVar2, x xVar3) {
        this.f17553m = c2;
        this.f17552l = xVar;
        this.f17554n = xVar2;
        this.f17555o = xVar3;
    }
}
