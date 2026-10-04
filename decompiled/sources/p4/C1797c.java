package p4;

import A4.AbstractC0011d;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1797c implements InterfaceC1801g {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14372b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1795a f14373c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14374d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14375e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14376f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14377g;

    public C1797c(Class cls, ArrayList arrayList, EnumC1795a enumC1795a, EnumC1796b enumC1796b, List list) {
        kotlin.jvm.internal.l.f("jClass", cls);
        kotlin.jvm.internal.l.f("methods", list);
        this.a = cls;
        this.f14372b = arrayList;
        this.f14373c = enumC1795a;
        this.f14374d = list;
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f14375e = arrayList2;
        List list2 = this.f14374d;
        ArrayList arrayList3 = new ArrayList(P3.r.p(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            kotlin.jvm.internal.l.c(returnType);
            List list3 = AbstractC0011d.a;
            Class<?> cls2 = (Class) AbstractC0011d.f220c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f14376f = arrayList3;
        List list4 = this.f14374d;
        ArrayList arrayList4 = new ArrayList(P3.r.p(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f14377g = arrayList4;
        if (this.f14373c == EnumC1795a.f14367l && enumC1796b == EnumC1796b.f14369k && !P3.q.D0(this.f14372b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // p4.InterfaceC1801g
    public final List a() {
        return this.f14375e;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // p4.InterfaceC1801g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C1797c.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ C1797c(Class cls, ArrayList arrayList, EnumC1795a enumC1795a) {
        EnumC1796b enumC1796b = EnumC1796b.f14370l;
        ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, enumC1795a, enumC1796b, arrayList2);
    }
}
