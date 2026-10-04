package B3;

import H5.D;
import O.Z;
import P3.J;
import android.content.Context;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s3.C1986C;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f505k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f506l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f508n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f509o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f510p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f511q;

    public /* synthetic */ n(H5.A a, Z z7, Context context, String str, Z z8, Z z9) {
        this.f505k = 2;
        this.f509o = a;
        this.f506l = z7;
        this.f511q = context;
        this.f510p = str;
        this.f507m = z8;
        this.f508n = z9;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Z z7;
        Object obj;
        Object next;
        switch (this.f505k) {
            case 0:
                Z z8 = this.f506l;
                String str = (String) this.f510p;
                z8.setValue(str);
                PlaybackPrefs playbackPrefs = PlaybackPrefs.INSTANCE;
                Context context = (Context) this.f511q;
                playbackPrefs.saveIntroPreset(context, str);
                O3.l lVar = kotlin.jvm.internal.l.a(str, "std1") ? new O3.l(90, 90) : kotlin.jvm.internal.l.a(str, "std2") ? new O3.l(85, 90) : new O3.l(0, 0);
                int iIntValue = ((Number) lVar.f7528k).intValue();
                int iIntValue2 = ((Number) lVar.f7529l).intValue();
                this.f507m.setValue(Integer.valueOf(iIntValue));
                this.f508n.setValue(Integer.valueOf(iIntValue2));
                playbackPrefs.saveIntroSec(context, iIntValue);
                playbackPrefs.saveOutroSec(context, iIntValue2);
                ((Z) this.f509o).setValue(Boolean.FALSE);
                break;
            case 1:
                Z z9 = this.f506l;
                StreamItem streamItem = (StreamItem) z9.getValue();
                Z z10 = this.f507m;
                if (streamItem == null) {
                    z10.setValue(Boolean.FALSE);
                } else {
                    Z z11 = this.f508n;
                    Iterator it = ((List) z11.getValue()).iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                        } else if (!kotlin.jvm.internal.l.a(((StreamItem) it.next()).getUrl(), streamItem.getUrl())) {
                            i7++;
                        }
                    }
                    int i8 = i7 + 1;
                    Iterator it2 = P3.q.o0((List) z11.getValue(), i8).iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        z7 = (Z) this.f509o;
                        obj = null;
                        if (zHasNext) {
                            next = it2.next();
                            if (!((Set) z7.getValue()).contains(((StreamItem) next).getUrl())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    StreamItem streamItem2 = (StreamItem) next;
                    if (streamItem2 == null) {
                        Iterator it3 = P3.q.o0((List) this.f510p, i8).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (!((Set) z7.getValue()).contains(((StreamItem) next2).getUrl())) {
                                    obj = next2;
                                }
                            }
                        }
                        streamItem2 = (StreamItem) obj;
                    }
                    z7.setValue(J.U((Set) z7.getValue(), streamItem.getUrl()));
                    if (streamItem2 == null || kotlin.jvm.internal.l.a(streamItem2.getUrl(), streamItem.getUrl())) {
                        z10.setValue(Boolean.FALSE);
                        ((Z) this.f511q).setValue(Boolean.TRUE);
                    } else {
                        z10.setValue(Boolean.TRUE);
                        z9.setValue(streamItem2);
                    }
                }
                break;
            case 2:
                Z z12 = this.f506l;
                z12.setValue(null);
                D.x((H5.A) this.f509o, null, new C1986C((Context) this.f511q, (String) this.f510p, this.f507m, this.f508n, z12, null), 3);
                break;
            default:
                String str2 = (String) this.f506l.getValue();
                String str3 = (String) this.f507m.getValue();
                byte[] bArr = (byte[]) this.f508n.getValue();
                String str4 = (String) ((Z) this.f509o).getValue();
                w3.j jVar = (w3.j) this.f510p;
                Context context2 = (Context) this.f511q;
                kotlin.jvm.internal.l.f("ctx", context2);
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str2);
                kotlin.jvm.internal.l.f("bio", str3);
                if (!((Boolean) jVar.f16982d.getValue()).booleanValue()) {
                    D.x(androidx.lifecycle.J.h(jVar), null, new w3.h(jVar, str2, context2, str3, bArr, str4, null), 3);
                }
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ n(Object obj, Context context, Z z7, Z z8, Z z9, Z z10, int i7) {
        this.f505k = i7;
        this.f510p = obj;
        this.f511q = context;
        this.f506l = z7;
        this.f507m = z8;
        this.f508n = z9;
        this.f509o = z10;
    }

    public /* synthetic */ n(List list, Z z7, Z z8, Z z9, Z z10, Z z11) {
        this.f505k = 1;
        this.f510p = list;
        this.f506l = z7;
        this.f507m = z8;
        this.f508n = z9;
        this.f509o = z10;
        this.f511q = z11;
    }
}
