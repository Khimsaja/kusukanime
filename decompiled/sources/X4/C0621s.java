package X4;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621s extends AbstractList implements RandomAccess, t {

    /* renamed from: l, reason: collision with root package name */
    public static final L f9908l = new L(new C0621s());

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9909k;

    public C0621s() {
        this.f9909k = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f9909k.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f9909k.size(), collection);
    }

    @Override // X4.t
    public final AbstractC0608e c(int i7) {
        AbstractC0608e vVar;
        ArrayList arrayList = this.f9909k;
        Object obj = arrayList.get(i7);
        if (obj instanceof AbstractC0608e) {
            vVar = (AbstractC0608e) obj;
        } else if (obj instanceof String) {
            try {
                vVar = new v(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException("UTF-8 not supported?", e7);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            vVar = new v(bArr2);
        }
        if (vVar != obj) {
            arrayList.set(i7, vVar);
        }
        return vVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f9909k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // X4.t
    public final L e() {
        return new L(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f9909k;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0608e) {
            AbstractC0608e abstractC0608e = (AbstractC0608e) obj;
            String strW = abstractC0608e.w();
            if (abstractC0608e.q()) {
                arrayList.set(i7, strW);
            }
            return strW;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC0620q.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (F.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i7, str);
            }
            return str;
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // X4.t
    public final void i(v vVar) {
        this.f9909k.add(vVar);
        ((AbstractList) this).modCount++;
    }

    @Override // X4.t
    public final List k() {
        return Collections.unmodifiableList(this.f9909k);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        Object objRemove = this.f9909k.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0608e) {
            return ((AbstractC0608e) objRemove).w();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = AbstractC0620q.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2 = this.f9909k.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0608e) {
            return ((AbstractC0608e) obj2).w();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = AbstractC0620q.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9909k.size();
    }

    public C0621s(t tVar) {
        this.f9909k = new ArrayList(tVar.size());
        addAll(tVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection instanceof t) {
            collection = ((t) collection).k();
        }
        boolean zAddAll = this.f9909k.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
