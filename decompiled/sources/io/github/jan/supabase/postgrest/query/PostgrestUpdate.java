package io.github.jan.supabase.postgrest.query;

import Z5.I;
import a6.C0673c;
import a6.d;
import a6.r;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import l4.InterfaceC1442u;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018\"\u0006\b\u0001\u0010\u0019\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0019H\u0086\f¢\u0006\u0002\u0010\u001cJ)\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u00110\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0086\u0004J.\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u001d0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001dH\u0086\u0004¢\u0006\u0002\u0010\u001eJ.\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u001f0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001fH\u0086\u0004¢\u0006\u0002\u0010 J.\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020!0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010!H\u0086\u0004¢\u0006\u0002\u0010\"J.\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020#0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010#H\u0086\u0004¢\u0006\u0002\u0010$J.\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018*\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020%0\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010%H\u0086\u0004¢\u0006\u0002\u0010&J\u001b\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0086\u0002J \u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001dH\u0086\u0002¢\u0006\u0002\u0010)J \u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001fH\u0086\u0002¢\u0006\u0002\u0010*J \u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010!H\u0086\u0002¢\u0006\u0002\u0010+J \u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010#H\u0086\u0002¢\u0006\u0002\u0010,J \u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010%H\u0086\u0002¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0011J(\u0010'\u001a\u00020\u0017\"\u0006\b\u0000\u0010\u0018\u0018\u00012\u0006\u0010(\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0018H\u0086\n¢\u0006\u0002\u0010/J\b\u00100\u001a\u000201H\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015¨\u00062"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Lio/github/jan/supabase/SupabaseSerializer;)V", "getPropertyConversionMethod$annotations", "()V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getSerializer$annotations", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "map", "", "", "Lkotlinx/serialization/json/JsonElement;", "getMap$annotations", "getMap", "()Ljava/util/Map;", "setTo", "", "T", "V", "Lkotlin/reflect/KProperty1;", "value", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;)V", "", "(Lkotlin/reflect/KProperty1;Ljava/lang/Integer;)V", "", "(Lkotlin/reflect/KProperty1;Ljava/lang/Long;)V", "", "(Lkotlin/reflect/KProperty1;Ljava/lang/Float;)V", "", "(Lkotlin/reflect/KProperty1;Ljava/lang/Double;)V", "", "(Lkotlin/reflect/KProperty1;Ljava/lang/Boolean;)V", "set", "column", "(Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/Float;)V", "(Ljava/lang/String;Ljava/lang/Double;)V", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "setToNull", "(Ljava/lang/String;Ljava/lang/Object;)V", "toJson", "Lkotlinx/serialization/json/JsonObject;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestUpdate {
    private final Map<String, b> map;
    private final PropertyConversionMethod propertyConversionMethod;
    private final SupabaseSerializer serializer;

    public PostgrestUpdate(PropertyConversionMethod propertyConversionMethod, SupabaseSerializer supabaseSerializer) {
        l.f("propertyConversionMethod", propertyConversionMethod);
        l.f("serializer", supabaseSerializer);
        this.propertyConversionMethod = propertyConversionMethod;
        this.serializer = supabaseSerializer;
        this.map = new LinkedHashMap();
    }

    public static /* synthetic */ void getMap$annotations() {
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public final Map<String, b> getMap() {
        return this.map;
    }

    public final PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final void set(String column, String value) {
        l.f("column", column);
        this.map.put(column, a6.l.b(value));
    }

    public final <T, V> void setTo(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        if (v5 == null) {
            setToNull(getPropertyConversionMethod().invoke(interfaceC1442u));
            return;
        }
        getPropertyConversionMethod().invoke(interfaceC1442u);
        getMap();
        getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public final void setToNull(String column) {
        l.f("column", column);
        this.map.put(column, JsonNull.INSTANCE);
    }

    public final c toJson() {
        return new c(this.map);
    }

    public final void set(String column, Integer value) {
        l.f("column", column);
        this.map.put(column, a6.l.a(value));
    }

    public final void set(String column, Long value) {
        l.f("column", column);
        this.map.put(column, a6.l.a(value));
    }

    public final void set(String column, Float value) {
        l.f("column", column);
        this.map.put(column, a6.l.a(value));
    }

    public final void set(String column, Double value) {
        l.f("column", column);
        this.map.put(column, a6.l.a(value));
    }

    public final void set(String column, Boolean value) {
        b rVar;
        l.f("column", column);
        Map<String, b> map = this.map;
        I i7 = a6.l.a;
        if (value == null) {
            rVar = JsonNull.INSTANCE;
        } else {
            rVar = new r(value, false, null);
        }
        map.put(column, rVar);
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, String str) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), str);
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, Integer num) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), num);
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, Long l7) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), l7);
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, Float f5) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), f5);
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, Double d4) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), d4);
    }

    public final <T> void set(String column, T value) {
        l.f("column", column);
        if (value == null) {
            setToNull(column);
            return;
        }
        getMap();
        getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public final <T> void setTo(InterfaceC1442u interfaceC1442u, Boolean bool) {
        l.f("<this>", interfaceC1442u);
        set(this.propertyConversionMethod.invoke(interfaceC1442u), bool);
    }
}
