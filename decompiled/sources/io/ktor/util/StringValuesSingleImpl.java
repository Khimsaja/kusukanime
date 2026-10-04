package io.ktor.util;

import P3.q;
import e4.n;
import f4.InterfaceC0881a;
import io.ktor.http.ContentDisposition;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", ContentDisposition.Parameters.Name, "", "values", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "", "entries", "()Ljava/util/Set;", "isEmpty", "()Z", "names", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "LO3/C;", "body", "forEach", "(Le4/n;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "Z", "getCaseInsensitiveName", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class StringValuesSingleImpl implements StringValues {
    private final boolean caseInsensitiveName;
    private final String name;
    private final List<String> values;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001J\u000f\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/ktor/util/StringValuesSingleImpl$entries$1", "", "", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "key", "Ljava/lang/String;", "getKey", "value", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.StringValuesSingleImpl$entries$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Map.Entry<String, List<? extends String>>, InterfaceC0881a {
        private final String key;
        private final List<String> value;

        public AnonymousClass1(StringValuesSingleImpl stringValuesSingleImpl) {
            this.key = stringValuesSingleImpl.getName();
            this.value = stringValuesSingleImpl.getValues();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public List<? extends String> getValue() {
            return this.value;
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public List<String> setValue2(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public StringValuesSingleImpl(boolean z7, String str, List<String> list) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("values", list);
        this.caseInsensitiveName = z7;
        this.name = str;
        this.values = list;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        return AbstractC2517v.M(name, this.name, getCaseInsensitiveName());
    }

    @Override // io.ktor.util.StringValues
    public Set<Map.Entry<String, List<String>>> entries() {
        return AbstractC1420H.K(new AnonymousClass1(this));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) other;
        if (getCaseInsensitiveName() != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public void forEach(n body) {
        l.f("body", body);
        body.invoke(this.name, this.values);
    }

    @Override // io.ktor.util.StringValues
    public String get(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        if (AbstractC2517v.M(name, this.name, getCaseInsensitiveName())) {
            return (String) q.t0(this.values);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public List<String> getAll(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        if (AbstractC2517v.M(this.name, name, getCaseInsensitiveName())) {
            return this.values;
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return StringValuesKt.entriesHashCode(entries(), Boolean.hashCode(getCaseInsensitiveName()) * 31);
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.StringValues
    public Set<String> names() {
        return AbstractC1420H.K(this.name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!getCaseInsensitiveName());
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name, String value) {
        l.f(ContentDisposition.Parameters.Name, name);
        l.f("value", value);
        return AbstractC2517v.M(name, this.name, getCaseInsensitiveName()) && this.values.contains(value);
    }
}
