package F1;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final p f2209c = new p(Collections.EMPTY_MAP);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2210b;

    public p(Map map) {
        this.f2210b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final p b(g gVar) {
        byte[] bytes;
        Map map = this.f2210b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) gVar.f2189b));
        for (int i7 = 0; i7 < listUnmodifiableList.size(); i7++) {
            map2.remove(listUnmodifiableList.get(i7));
        }
        HashMap map3 = new HashMap((HashMap) gVar.a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new p(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return c(this.f2210b, ((p) obj).f2210b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f2210b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = iHashCode;
        }
        return this.a;
    }
}
