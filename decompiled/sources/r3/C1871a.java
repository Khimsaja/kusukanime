package r3;

import O.Z;
import O3.C;
import com.kusukanime.data.ProfileRow;
import com.kusukanime.data.StreamItem;
import io.ktor.util.GzipHeaderFlags;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1871a implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14858k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f14859l;

    public /* synthetic */ C1871a(int i7, Z z7) {
        this.f14858k = i7;
        this.f14859l = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f14858k) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                this.f14859l.setValue(str);
                break;
            case 1:
                StreamItem streamItem = (StreamItem) obj;
                kotlin.jvm.internal.l.f("it", streamItem);
                this.f14859l.setValue(streamItem);
                break;
            case 2:
                StreamItem streamItem2 = (StreamItem) obj;
                kotlin.jvm.internal.l.f("it", streamItem2);
                this.f14859l.setValue(streamItem2);
                break;
            case 3:
                StreamItem streamItem3 = (StreamItem) obj;
                kotlin.jvm.internal.l.f("it", streamItem3);
                this.f14859l.setValue(streamItem3);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                String str2 = (String) obj;
                kotlin.jvm.internal.l.f("it", str2);
                this.f14859l.setValue(str2);
                break;
            case 5:
                String str3 = (String) obj;
                kotlin.jvm.internal.l.f("it", str3);
                this.f14859l.setValue(str3);
                break;
            case 6:
                String str4 = (String) obj;
                kotlin.jvm.internal.l.f("it", str4);
                if (str4.length() <= 40) {
                    this.f14859l.setValue(str4);
                }
                break;
            case 7:
                ProfileRow profileRow = (ProfileRow) obj;
                kotlin.jvm.internal.l.f("it", profileRow);
                this.f14859l.setValue(profileRow);
                break;
            default:
                String str5 = (String) obj;
                kotlin.jvm.internal.l.f("it", str5);
                if (str5.length() <= 200) {
                    this.f14859l.setValue(str5);
                }
                break;
        }
        return C.a;
    }
}
