package io.ktor.util.collections;

import e4.k;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import l4.InterfaceC1443v;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0087\u0002¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\r\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\t\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lio/ktor/util/collections/StringMap;", "thisRef", "Ll4/v;", "property", "getValue", "(Ljava/lang/String;Lio/ktor/util/collections/StringMap;Ll4/v;)Ljava/lang/String;", "value", "LO3/C;", "setValue", "(Ljava/lang/String;Lio/ktor/util/collections/StringMap;Ll4/v;Ljava/lang/String;)V", "T", "Lio/ktor/util/collections/SerializedMapValue;", "(Lio/ktor/util/collections/SerializedMapValue;Lio/ktor/util/collections/StringMap;Ll4/v;)Ljava/lang/Object;", "(Lio/ktor/util/collections/SerializedMapValue;Lio/ktor/util/collections/StringMap;Ll4/v;Ljava/lang/Object;)V", "", "asBoolean", "(Ljava/lang/String;)Lio/ktor/util/collections/SerializedMapValue;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MapDelegatesKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.collections.MapDelegatesKt$asBoolean$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, Boolean.TYPE, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Boolean) obj).booleanValue());
        }

        public final String invoke(boolean z7) {
            return String.valueOf(z7);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.collections.MapDelegatesKt$asBoolean$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends j implements k {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, AbstractC2510o.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
        }

        @Override // e4.k
        public final Boolean invoke(String str) {
            l.f("p0", str);
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    @InternalAPI
    public static final SerializedMapValue<Boolean> asBoolean(String str) {
        l.f("<this>", str);
        return new SerializedMapValue<>(str, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
    }

    @InternalAPI
    public static final String getValue(String str, StringMap stringMap, InterfaceC1443v interfaceC1443v) {
        l.f("<this>", str);
        l.f("thisRef", stringMap);
        l.f("property", interfaceC1443v);
        return stringMap.get(str);
    }

    @InternalAPI
    public static final void setValue(String str, StringMap stringMap, InterfaceC1443v interfaceC1443v, String str2) {
        l.f("<this>", str);
        l.f("thisRef", stringMap);
        l.f("property", interfaceC1443v);
        if (str2 == null) {
            stringMap.remove(str);
        } else {
            stringMap.set(str, str2);
        }
    }

    @InternalAPI
    public static final <T> T getValue(SerializedMapValue<T> serializedMapValue, StringMap stringMap, InterfaceC1443v interfaceC1443v) {
        l.f("<this>", serializedMapValue);
        l.f("thisRef", stringMap);
        l.f("property", interfaceC1443v);
        String str = stringMap.get(serializedMapValue.getKey());
        if (str != null) {
            return (T) serializedMapValue.getDeserialize().invoke(str);
        }
        return null;
    }

    @InternalAPI
    public static final <T> void setValue(SerializedMapValue<T> serializedMapValue, StringMap stringMap, InterfaceC1443v interfaceC1443v, T t7) {
        l.f("<this>", serializedMapValue);
        l.f("thisRef", stringMap);
        l.f("property", interfaceC1443v);
        if (t7 == null) {
            stringMap.remove(serializedMapValue.getKey());
        } else {
            stringMap.set(serializedMapValue.getKey(), (String) serializedMapValue.getSerialize().invoke(t7));
        }
    }
}
