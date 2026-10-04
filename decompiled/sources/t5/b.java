package t5;

import P3.AbstractC0561b;

/* loaded from: classes.dex */
public final class b extends AbstractC0561b {

    /* renamed from: m, reason: collision with root package name */
    public int f16091m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f16092n;

    public b(c cVar) {
        this.f16092n = cVar;
    }

    @Override // P3.AbstractC0561b
    public final void a() {
        int i7;
        Object[] objArr;
        do {
            i7 = this.f16091m + 1;
            this.f16091m = i7;
            objArr = this.f16092n.f16093k;
            if (i7 >= objArr.length) {
                break;
            }
        } while (objArr[i7] == null);
        if (i7 >= objArr.length) {
            this.f7756k = 2;
            return;
        }
        Object obj = objArr[i7];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl", obj);
        this.f7757l = obj;
        this.f7756k = 1;
    }
}
