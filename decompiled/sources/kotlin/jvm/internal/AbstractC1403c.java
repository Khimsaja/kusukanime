package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import l4.EnumC1414B;
import l4.InterfaceC1424c;
import l4.InterfaceC1427f;
import l4.InterfaceC1436o;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1403c implements InterfaceC1424c, Serializable {
    public static final Object NO_RECEIVER = C1402b.f12711k;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1424c reflected;
    private final String signature;

    public AbstractC1403c(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }

    @Override // l4.InterfaceC1424c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // l4.InterfaceC1424c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1424c compute() {
        InterfaceC1424c interfaceC1424c = this.reflected;
        if (interfaceC1424c != null) {
            return interfaceC1424c;
        }
        InterfaceC1424c interfaceC1424cComputeReflected = computeReflected();
        this.reflected = interfaceC1424cComputeReflected;
        return interfaceC1424cComputeReflected;
    }

    public abstract InterfaceC1424c computeReflected();

    @Override // l4.InterfaceC1423b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // l4.InterfaceC1424c
    public String getName() {
        return this.name;
    }

    public InterfaceC1427f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? y.a.c(cls) : y.a.b(cls);
    }

    @Override // l4.InterfaceC1424c
    public List<InterfaceC1436o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1424c getReflected();

    @Override // l4.InterfaceC1424c
    public InterfaceC1444w getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // l4.InterfaceC1424c
    public List<InterfaceC1445x> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // l4.InterfaceC1424c
    public EnumC1414B getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // l4.InterfaceC1424c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // l4.InterfaceC1424c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // l4.InterfaceC1424c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // l4.InterfaceC1424c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
