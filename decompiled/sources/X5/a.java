package X5;

import P3.y;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public List f9919b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9920c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f9921d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9922e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9923f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9924g;

    public a(String str) {
        l.f("serialName", str);
        this.a = str;
        this.f9919b = y.f7779k;
        this.f9920c = new ArrayList();
        this.f9921d = new HashSet();
        this.f9922e = new ArrayList();
        this.f9923f = new ArrayList();
        this.f9924g = new ArrayList();
    }

    public final void a(String str, SerialDescriptor serialDescriptor, boolean z7) {
        y yVar = y.f7779k;
        l.f("elementName", str);
        l.f("descriptor", serialDescriptor);
        if (!this.f9921d.add(str)) {
            StringBuilder sbQ = AbstractC0703b.q("Element with name '", str, "' is already registered in ");
            sbQ.append(this.a);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        this.f9920c.add(str);
        this.f9922e.add(serialDescriptor);
        this.f9923f.add(yVar);
        this.f9924g.add(Boolean.valueOf(z7));
    }
}
