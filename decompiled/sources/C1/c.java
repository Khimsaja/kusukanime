package C1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: m, reason: collision with root package name */
    public final long f570m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f571n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f572o;

    public c(int i7, long j7) {
        super(i7);
        this.f570m = j7;
        this.f571n = new ArrayList();
        this.f572o = new ArrayList();
    }

    public final c f(int i7) {
        ArrayList arrayList = this.f572o;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) arrayList.get(i8);
            if (cVar.f575l == i7) {
                return cVar;
            }
        }
        return null;
    }

    public final d g(int i7) {
        ArrayList arrayList = this.f571n;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) arrayList.get(i8);
            if (dVar.f575l == i7) {
                return dVar;
            }
        }
        return null;
    }

    @Override // C1.e
    public final String toString() {
        return e.b(this.f575l) + " leaves: " + Arrays.toString(this.f571n.toArray()) + " containers: " + Arrays.toString(this.f572o.toArray());
    }
}
