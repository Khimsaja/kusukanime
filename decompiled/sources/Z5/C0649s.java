package Z5;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import l4.InterfaceC1425d;

/* renamed from: Z5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649s implements p0 {

    /* renamed from: k, reason: collision with root package name */
    public final e4.k f10352k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f10353l;

    public C0649s(int i7, e4.k kVar) {
        switch (i7) {
            case 1:
                this.f10352k = kVar;
                this.f10353l = new ConcurrentHashMap();
                break;
            default:
                this.f10352k = kVar;
                this.f10353l = new ConcurrentHashMap();
                break;
        }
    }

    @Override // Z5.p0
    public KSerializer D0(InterfaceC1425d interfaceC1425d) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f10353l;
        Class clsF = n6.m.F(interfaceC1425d);
        Object c0642k = concurrentHashMap.get(clsF);
        if (c0642k == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsF, (c0642k = new C0642k((KSerializer) this.f10352k.invoke(interfaceC1425d))))) != null) {
            c0642k = objPutIfAbsent;
        }
        return ((C0642k) c0642k).a;
    }

    public Object a(Class cls) {
        kotlin.jvm.internal.l.f("key", cls);
        ConcurrentHashMap concurrentHashMap = this.f10353l;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f10352k.invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
