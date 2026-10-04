package B3;

import H5.D;
import O.Z;
import android.content.Context;
import androidx.lifecycle.J;
import com.kusukanime.data.CommentRow;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import java.util.List;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f495o;

    public /* synthetic */ j(Object obj, Z z7, Z z8, Z z9, int i7) {
        this.f491k = i7;
        this.f495o = obj;
        this.f493m = z7;
        this.f494n = z8;
        this.f492l = z9;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f491k) {
            case 0:
                Z z7 = this.f493m;
                String str = (String) this.f495o;
                z7.setValue(str);
                PlaybackPrefs.INSTANCE.saveQuality((Context) this.f492l, str);
                this.f494n.setValue(Boolean.FALSE);
                break;
            case 1:
                D.x((M5.c) this.f495o, null, new y((Context) this.f492l, this.f493m, this.f494n, null), 3);
                break;
            case 2:
                Z z8 = this.f493m;
                if (!AbstractC2510o.g0((String) z8.getValue())) {
                    Z z9 = this.f494n;
                    if (!((Boolean) z9.getValue()).booleanValue()) {
                        z9.setValue(Boolean.TRUE);
                        Z z10 = (Z) this.f492l;
                        CommentRow commentRow = (CommentRow) z10.getValue();
                        String id = commentRow != null ? commentRow.getId() : null;
                        String string = AbstractC2510o.J0((String) z8.getValue()).toString();
                        m mVar = new m(z8, z9, z10);
                        r3.m mVar2 = (r3.m) this.f495o;
                        kotlin.jvm.internal.l.f("content", string);
                        D.x(J.h(mVar2), null, new r3.l(mVar2, string, id, mVar, null), 3);
                    }
                }
                break;
            default:
                this.f493m.setValue(P3.A.f7737k);
                this.f494n.setValue(Boolean.FALSE);
                ((Z) this.f492l).setValue((StreamItem) P3.q.t0((List) this.f495o));
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ j(Object obj, Context context, Z z7, Z z8, int i7) {
        this.f491k = i7;
        this.f495o = obj;
        this.f492l = context;
        this.f493m = z7;
        this.f494n = z8;
    }
}
