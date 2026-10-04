package Z5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Z5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629d extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10318b;

    /* renamed from: c, reason: collision with root package name */
    public final P f10319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629d(KSerializer kSerializer, int i7) {
        super(kSerializer);
        this.f10318b = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("eSerializer", kSerializer);
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                kotlin.jvm.internal.l.f("elementDesc", descriptor);
                this.f10319c = new C0627c(descriptor, 2);
                break;
            case 2:
                kotlin.jvm.internal.l.f("eSerializer", kSerializer);
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                kotlin.jvm.internal.l.f("elementDesc", descriptor2);
                this.f10319c = new C0627c(descriptor2, 3);
                break;
            default:
                kotlin.jvm.internal.l.f("element", kSerializer);
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                kotlin.jvm.internal.l.f("elementDesc", descriptor3);
                this.f10319c = new C0627c(descriptor3, 1);
                break;
        }
    }

    @Override // Z5.AbstractC0623a
    public final Object a() {
        switch (this.f10318b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // Z5.AbstractC0623a
    public final int b(Object obj) {
        switch (this.f10318b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.l.f("<this>", arrayList);
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f("<this>", hashSet);
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f("<this>", linkedHashSet);
                return linkedHashSet.size();
        }
    }

    @Override // Z5.AbstractC0623a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.l.f("<this>", collection);
        return collection.iterator();
    }

    @Override // Z5.AbstractC0623a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.l.f("<this>", collection);
        return collection.size();
    }

    @Override // Z5.AbstractC0623a
    public final Object g(Object obj) {
        switch (this.f10318b) {
            case 0:
                kotlin.jvm.internal.l.f("<this>", null);
                return new ArrayList((Collection) null);
            case 1:
                kotlin.jvm.internal.l.f("<this>", null);
                return new HashSet((Collection) null);
            default:
                kotlin.jvm.internal.l.f("<this>", null);
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f10318b) {
        }
        return (C0627c) this.f10319c;
    }

    @Override // Z5.AbstractC0623a
    public final Object h(Object obj) {
        switch (this.f10318b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.l.f("<this>", arrayList);
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f("<this>", hashSet);
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f("<this>", linkedHashSet);
                return linkedHashSet;
        }
    }

    @Override // Z5.r
    public final void i(int i7, Object obj, Object obj2) {
        switch (this.f10318b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.l.f("<this>", arrayList);
                arrayList.add(i7, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.l.f("<this>", hashSet);
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.l.f("<this>", linkedHashSet);
                linkedHashSet.add(obj2);
                break;
        }
    }
}
