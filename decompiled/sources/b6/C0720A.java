package b6;

import Z5.AbstractC0632e0;
import b1.AbstractC0703b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: b6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0720A extends AbstractC0726a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.c f10957f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor f10958g;

    /* renamed from: h, reason: collision with root package name */
    public int f10959h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10960i;

    public /* synthetic */ C0720A(a6.d dVar, kotlinx.serialization.json.c cVar, String str, int i7) {
        this(dVar, cVar, (i7 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // b6.AbstractC0726a
    public kotlinx.serialization.json.b E(String str) {
        kotlin.jvm.internal.l.f("tag", str);
        return (kotlinx.serialization.json.b) P3.E.m0(str, S());
    }

    @Override // b6.AbstractC0726a
    public String Q(SerialDescriptor serialDescriptor, int i7) {
        Object next;
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        a6.d dVar = this.f11011c;
        v.q(dVar, serialDescriptor);
        String strG = serialDescriptor.g(i7);
        if (this.f11013e.f10482i && !S().f12722k.keySet().contains(strG)) {
            kotlin.jvm.internal.l.f("<this>", dVar);
            w wVar = v.a;
            Z5.A a = new Z5.A(1, serialDescriptor, dVar);
            X4.y yVar = dVar.f10461c;
            yVar.getClass();
            Object objW = yVar.w(serialDescriptor, wVar);
            if (objW == null) {
                objW = a.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yVar.f9916l;
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(wVar, objW);
            }
            Map map = (Map) objW;
            Iterator it = S().f12722k.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i7) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // b6.AbstractC0726a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c S() {
        return this.f10957f;
    }

    @Override // b6.AbstractC0726a, kotlinx.serialization.encoding.Decoder
    public final Y5.a a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        SerialDescriptor serialDescriptor2 = this.f10958g;
        if (serialDescriptor != serialDescriptor2) {
            return super.a(serialDescriptor);
        }
        kotlinx.serialization.json.b bVarF = F();
        String strE = serialDescriptor2.e();
        if (bVarF instanceof kotlinx.serialization.json.c) {
            return new C0720A(this.f11011c, (kotlinx.serialization.json.c) bVarF, this.f11012d, serialDescriptor2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        sb.append(zVar.b(kotlinx.serialization.json.c.class).n());
        sb.append(", but had ");
        sb.append(zVar.b(bVarF.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strE);
        sb.append(" at element: ");
        sb.append(U());
        throw v.c(-1, bVarF.toString(), sb.toString());
    }

    @Override // b6.AbstractC0726a, Y5.a
    public void b(SerialDescriptor serialDescriptor) {
        Set setT;
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        a6.d dVar = this.f11011c;
        if (v.n(dVar, serialDescriptor) || (serialDescriptor.c() instanceof X5.d)) {
            return;
        }
        v.q(dVar, serialDescriptor);
        if (this.f11013e.f10482i) {
            Set setB = AbstractC0632e0.b(serialDescriptor);
            Map map = (Map) dVar.f10461c.w(serialDescriptor, v.a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = P3.A.f7737k;
            }
            setT = P3.J.T(setB, setKeySet);
        } else {
            setT = AbstractC0632e0.b(serialDescriptor);
        }
        for (String str : S().f12722k.keySet()) {
            if (!setT.contains(str) && !kotlin.jvm.internal.l.a(str, this.f11012d)) {
                StringBuilder sbQ = AbstractC0703b.q("Encountered an unknown key '", str, "' at element: ");
                sbQ.append(U());
                sbQ.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbQ.append((Object) v.p(S().toString(), -1));
                throw v.d(-1, sbQ.toString());
            }
        }
    }

    @Override // b6.AbstractC0726a, kotlinx.serialization.encoding.Decoder
    public final boolean i() {
        return !this.f10960i && super.i();
    }

    @Override // Y5.a
    public int m(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        while (this.f10959h < serialDescriptor.f()) {
            int i7 = this.f10959h;
            this.f10959h = i7 + 1;
            String strR = R(serialDescriptor, i7);
            int i8 = this.f10959h - 1;
            this.f10960i = false;
            if (!S().containsKey(strR)) {
                boolean z7 = (this.f11011c.a.f10478e || serialDescriptor.k(i8) || !serialDescriptor.j(i8).h()) ? false : true;
                this.f10960i = z7;
                if (z7) {
                }
            }
            this.f11013e.getClass();
            return i8;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720A(a6.d dVar, kotlinx.serialization.json.c cVar, String str, SerialDescriptor serialDescriptor) {
        super(dVar, str);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("value", cVar);
        this.f10957f = cVar;
        this.f10958g = serialDescriptor;
    }
}
