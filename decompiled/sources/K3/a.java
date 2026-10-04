package K3;

import e4.k;
import io.github.jan.supabase.collections.AtomicMutableList;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4693k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4694l;

    public /* synthetic */ a(int i7, Object obj) {
        this.f4693k = i7;
        this.f4694l = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlinx.serialization.descriptors.SerialDescriptor] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f4693k) {
            case 0:
                return AtomicMutableList.add$lambda$1(this.f4694l, (D5.b) obj);
            case 1:
                return AtomicMutableList.remove$lambda$0(this.f4694l, (D5.b) obj);
            default:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                ?? r12 = this.f4694l;
                sb.append(r12.g(iIntValue));
                sb.append(": ");
                sb.append(r12.j(iIntValue).e());
                return sb.toString();
        }
    }
}
