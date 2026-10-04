package V5;

import O3.C;
import Z5.t0;
import io.ktor.http.LinkHeader;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f9492l;

    public /* synthetic */ e(f fVar, int i7) {
        this.f9491k = i7;
        this.f9492l = fVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        X5.a aVar = (X5.a) obj;
        switch (this.f9491k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                aVar.a(LinkHeader.Parameters.Type, t0.f10356b, (12 & 8) == 0);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                f fVar = this.f9492l;
                sb.append(fVar.a.n());
                sb.append('>');
                aVar.a("value", AbstractC1420H.j(sb.toString(), X5.h.f9949h, new SerialDescriptor[0], new e(fVar, 1)), (12 & 8) == 0);
                List list = fVar.f9493b;
                kotlin.jvm.internal.l.f("<set-?>", list);
                aVar.f9919b = list;
                break;
            default:
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar);
                for (Map.Entry entry : this.f9492l.f9496e.entrySet()) {
                    aVar.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), (12 & 8) == 0);
                }
                break;
        }
        return C.a;
    }
}
