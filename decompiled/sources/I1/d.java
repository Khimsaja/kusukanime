package I1;

import B1.AbstractC0015b;
import B1.B;
import B1.InterfaceC0021h;
import B1.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j3.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s2.C1973a;
import s2.C1983k;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements n, InterfaceC0021h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3949k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3950l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3951m;

    public /* synthetic */ d(a aVar, int i7, long j7, long j8) {
        this.f3951m = aVar;
        this.f3950l = i7;
        this.f3949k = j7;
    }

    @Override // B1.InterfaceC0021h
    public void c(Object obj) {
        C1973a c1973a = (C1973a) obj;
        C1983k c1983k = (C1983k) this.f3951m;
        AbstractC0015b.i(c1983k.f15528h);
        G g4 = c1973a.a;
        long j7 = c1973a.f15509c;
        q2.d dVar = new q2.d(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(g4.size());
        Iterator<E> it = g4.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) dVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j7);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        B b4 = c1983k.f15523c;
        b4.getClass();
        b4.D(bArrMarshall, bArrMarshall.length);
        c1983k.a.c(b4, bArrMarshall.length, 0);
        long j8 = c1973a.f15508b;
        long j9 = this.f3949k;
        if (j8 == -9223372036854775807L) {
            AbstractC0015b.h(c1983k.f15528h.f18117s == Long.MAX_VALUE);
        } else {
            long j10 = c1983k.f15528h.f18117s;
            j9 = j10 == Long.MAX_VALUE ? j9 + j8 : j8 + j10;
        }
        c1983k.a.b(j9, this.f3950l | 1, bArrMarshall.length, 0, null);
    }

    @Override // B1.n
    public void invoke(Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        a aVar = (a) this.f3951m;
        O1.B b4 = aVar.f3939d;
        if (b4 != null) {
            String strC = kVar.f3978c.c(aVar.f3937b, b4);
            HashMap map = kVar.f3984i;
            Long l7 = (Long) map.get(strC);
            HashMap map2 = kVar.f3983h;
            Long l8 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l7 == null ? 0L : l7.longValue()) + this.f3949k));
            map2.put(strC, Long.valueOf((l8 != null ? l8.longValue() : 0L) + this.f3950l));
        }
    }

    public /* synthetic */ d(C1983k c1983k, long j7, int i7) {
        this.f3951m = c1983k;
        this.f3949k = j7;
        this.f3950l = i7;
    }
}
