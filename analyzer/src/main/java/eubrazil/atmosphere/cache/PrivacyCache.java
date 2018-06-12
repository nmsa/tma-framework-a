package eubrazil.atmosphere.cache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.repository.PrivacyRepository;

public class PrivacyCache {

	@Autowired
	private PrivacyRepository repository;

	// Estrutura de cache
	LoadingCache<Long, Privacy> privacyCache = CacheBuilder.newBuilder().maximumSize(10)
			.expireAfterAccess(30, TimeUnit.MINUTES).build(new CacheLoader<Long, Privacy>() {
				@Override
				public Privacy load(Long id) throws Exception {
					return getPrivacyFromRepository(id);
				}
			});

	private Privacy getPrivacyFromRepository(Long id) {
		return repository.findOne(id);
	}

	public Privacy getPrivacy(Long id) {
		try {
			return privacyCache.get(id);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
